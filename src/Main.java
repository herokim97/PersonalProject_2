import BaseBallGame.GameStart;


import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GameStart gameStart = new GameStart();
        boolean exit = true;



        while (exit) {
            System.out.println("welcome!! choice one!");
            System.out.println("1. startGame 2. GameRecord 3. exit");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    gameStart.start();
                    break;
                case "3":
                    exit = false;
                    System.out.println("good bye");
                    break;
            }

        }


    }
}