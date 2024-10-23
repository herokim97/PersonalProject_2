import BaseBallGame.GameLog;
import BaseBallGame.GameStart;


import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GameLog gameLog = new GameLog();
        GameStart gameStart = new GameStart(gameLog);
        boolean exit = true;

        while (exit) {
            System.out.println("welcome!! choice one!");
            System.out.println("1. startGame 2. GameRecord 3. exit");

            String choice = sc.nextLine();

            switch (choice) {
                case "0":
                    //자릿수에 따른 난이도 분류 코드

                case "1":
                    gameStart.gameReset();
                    gameStart.start();
                    break;
                case "2" :
                    gameLog.logPrint();
                    break;
                case "3":
                    exit = false;
                    System.out.println("good bye");
                    break;
                default:
                    System.out.println("wrong input >> retry");
                    continue;
            }

        }


    }
}