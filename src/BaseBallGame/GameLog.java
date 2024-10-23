package BaseBallGame;

import java.util.*;

public class GameLog {

    private int gameCount;
    private int tryCount;

    HashMap<Integer, Integer> gameLog = new HashMap<>();


    public GameLog() {
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public void setTryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    public void logSave(int gameCount, int tryCount) {
        //dictionary 형태로 저장
        gameLog.put(gameCount, tryCount);
//        System.out.println(gameCount + " " + tryCount);
    }

    public void logPrint() {
        System.out.println(" --GameLog-- ");
//        System.out.println(gameLog + " " + tryCount);
//        if(gameLog.isEmpty()) {
//            System.out.println("한 번도 게임을 하지 않았습니다.");
//        }
//        else {
        for (Integer key : gameLog.keySet()) {
            System.out.println(key + "번째 게임 : 시도 횟수 - " + gameLog.get(key));
        }
    }

}


