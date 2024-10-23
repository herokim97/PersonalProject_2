package BaseBallGame;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class GameStart {
    Scanner sc = new Scanner(System.in);
    LinkedHashSet<Integer> answerLinkedHashSet = new LinkedHashSet<>();
    NumberValid numberValid = new NumberValid();
    //게임 횟수 추가
    int gameCount = 0;
    int tryCount = 0;

    GameLog gameLog; //객체 선언
    MakeNumber makeNumber;

    public void gameReset(int level) {
        answerLinkedHashSet.clear();
        makeNumber = new MakeNumber();
        gameCount++;
        tryCount = 0;
        System.out.println("making Number... >> ");
        makeNumber.make(level);
//        System.out.println("정답 테스트 >> " + makeNumber.getResult());
    }

    //공용 객체 사용 시, 생성자에서 파라미터로 전달.
    public GameStart(GameLog gameLog) {
        this.gameLog = gameLog;
    }


    public void start(int level) {
        //사용자 입력 코드
        while (numberValid.getStrike() != level) {
            tryCount++;
            for (int i = 0; i < level; i++) {
                System.out.println(i + 1 + " 번째 값 입력. >>  ");
                try {
                    String answer = sc.nextLine();
                    int answerAdd = Integer.parseInt(answer);
                    // 0이하, 10 이상 값 예외 처리
                    if (answerAdd <= 0 || answerAdd > 9) {
                        throw new RuntimeException("1~9 값만 입력해야합니다.");
                    }
                    if (answerLinkedHashSet.contains(answerAdd)) {
                        System.out.println("중복된 값입니다. 다시 입력하세요 >> ");
                        i--;
                    } else {
                        answerLinkedHashSet.add(answerAdd);
                    }
                    //정수형 예외처리
                } catch (NumberFormatException e) {
                    System.out.println("error : 정수형만 입력해야 합니다");
                    i--;
                }
                // 범위 예외 처리
                catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    i--;
                }
            }

            System.out.println("입력 값 = " + answerLinkedHashSet);

            //검증 절차
            numberValid.setAnswer(answerLinkedHashSet);
            numberValid.setProblem(makeNumber.getResult());
            numberValid.InvalidAnswer(level);
        }
        numberValid.reset();
        gameLog.setGameCount(gameCount);
        gameLog.setTryCount(tryCount);
        System.out.println("gameCount : " + gameCount + " " + "tryCount : " + tryCount);
        gameLog.logSave(gameCount, tryCount);


    }

}
