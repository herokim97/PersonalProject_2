package BaseBallGame;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class GameStart {
    Scanner sc = new Scanner(System.in);
    LinkedHashSet<Integer> answer_HashSet = new LinkedHashSet<>();
    NumberValid numberValid = new NumberValid();

    public GameStart() {
    }

    public void start() {
        MakeNumber makeNumber = new MakeNumber();

        System.out.println("making Number... >> ");
        makeNumber.make();
        System.out.println("정답 테스트 >> " + makeNumber.getResult());

        //사용자 입력 코드
        while(numberValid.getStrike() != 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + 1 + " 번째 값 입력. >>  ");
                try {
                    String answer = sc.nextLine();
                    int answer_add = Integer.parseInt(answer);
                    // 0이하, 10 이상 값 예외 처리
                    if (answer_add <= 0 || answer_add > 9) {
                        throw new RuntimeException("1~9 값만 입력해야합니다.");
                    }
                    answer_HashSet.add(answer_add);

                    //정수형 예외처리
                } catch (NumberFormatException e) {
                    System.out.println("error : 정수형만 입력해야 합니다");
                    i--;
                    // 범위 예외 처리
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    i--;
                }

            }

            System.out.println("입력 값 = " + answer_HashSet);

            //검증 절차
            numberValid.setAnswer(answer_HashSet);
            numberValid.setProblem(makeNumber.getResult());

            numberValid.InvalidAnswer();






        }


    }

}
