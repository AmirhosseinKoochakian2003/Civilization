package View;

import Controller.MainMenuController;
import Model.Member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MainMenu {
    private Member loggedInMember;
    public MainMenu(Member loggedInMember){
        this.loggedInMember = loggedInMember;
    }
    public void run(Scanner scan) throws IOException {
        System.out.println("user logged in successfully!");
        MainMenuController mainMenuController = new MainMenuController();
        PlayGameMenu playGameMenu = new PlayGameMenu();
        ProfileMenu profileMenu = new ProfileMenu(loggedInMember);
        String enterProfileMenuRegex = "\\s*menu\\s+enter\\s+Profile\\s+Menu\\s*";
        String exitMenuRegex = "\\s*menu\\s+exit\\s*";
        String showCurrentMenuRegex = "\\s*menu\\s+show-current\\s*";
        String logoutRegex = "\\s*user\\s+logout\\s*";
        String playGameRegex = "\\s*play\\s+game\\s+--player1\\s+(?<username>\\S+)";
        String command;
        ArrayList<Member> allMembers = mainMenuController.getAllMembers();

        while(true){
            command = scan.nextLine();
            if (mainMenuController.getMatcher(exitMenuRegex, command) != null) {
                break;
            }
            else if (mainMenuController.getMatcher(logoutRegex, command) != null){
                break;
            }
            else if (mainMenuController.getMatcher(showCurrentMenuRegex, command) != null)
                System.out.println("Main Menu");
            else if(mainMenuController.getMatcher(playGameRegex, command) != null) {
                ArrayList<String> userNames = new ArrayList<>();
                String[] commandSplit = command.split("\\s+");
                for (int i = 3; i < commandSplit.length; i += 2)
                    userNames.add(commandSplit[i]);
                int numOfPlayers = userNames.size();
                ArrayList<Member> players = new ArrayList<>();
                players.add(loggedInMember);
                boolean ourBool = true;
                for (int i = 0; i < numOfPlayers; i++) {
                    boolean exist = false;
                    for (int j = 0; j < allMembers.size(); j++) {
                        if (allMembers.get(j).getUsername().equals(userNames.get(i))){
                            players.add(allMembers.get(j));
                            exist = true;
                            break;
                        }
                    }
                    if (!exist) {
                        System.out.println("user with this username doesn't exist!");
                        ourBool = false;
                        break;
                    }
                }
                if(ourBool)
                    playGameMenu.run(scan, players.size(), players);
            }
            else if(mainMenuController.getMatcher(enterProfileMenuRegex, command) != null)
                profileMenu.run(scan);
            else
                System.out.println("invalid command");
        }

    }
}
