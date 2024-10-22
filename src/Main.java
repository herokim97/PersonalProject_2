import BaseBallGame.GameStart;
import BaseBallGame.MakeNumber;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        GameStart gameStart = new GameStart();
        MakeNumber makeNumber = new MakeNumber();

        System.out.println("welcome!! choice one!");
        System.out.println("1. startGame 2. GameRecord 3. exit");

        gameStart.start();

    }
}