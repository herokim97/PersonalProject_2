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
            int level = 3;
            boolean flag = true;
            System.out.println("========================");
            System.out.println("welcome!! choice one!");
            System.out.println("0.choice level 1. startGame 2. GameRecord 3. exit");

            String choice = sc.nextLine();

            switch (choice) {
                case "0":
                    //자릿수에 따른 난이도 분류 코드
                    while (flag) {
                        System.out.println("Setting choice level");
                        String choiceLevel = sc.nextLine();
                        if("3".equals(choiceLevel) || "4".equals(choiceLevel) || "5".equals(choiceLevel)) {
                            level = Integer.parseInt(choiceLevel);
                            gameStart.gameReset(level);
                            gameStart.start(level);
                            flag = false;
                            break;
                        }

                        System.out.println("Wrong Input >> retry >> ");
//                        switch (choiceLevel) {
//
//                            //자릿수 선택 3
//                            case "3":
//                                level = 3;
//                                gameStart.gameReset(level);
//                                gameStart.start(level);
//                                flag = false;
//                                break;
//
//                            //자릿수 선택 4
//                            case "4":
//                                level = 4;
//                                gameStart.gameReset(level);
//                                gameStart.start(level);
//                                flag = false;
//                                break;
//
//                            //자릿수 선택 5
//                            case "5":
//                                level = 5;
//                                gameStart.gameReset(level);
//                                gameStart.start(level);
//                                flag = false;
//                                break;
//
//                            default:
//                                System.out.println("Wrong level >> retry !!");
//                        }
                    }
                    break;

                case "1":
                    gameStart.gameReset(level);
                    gameStart.start(level);
                    break;
                case "2":
                    gameLog.logPrint();
                    break;
                case "3":
                    exit = false;
                    System.out.println("good bye");
                    break;
                default:
                    System.out.println("wrong input >> retry");

            }

        }


    }
}