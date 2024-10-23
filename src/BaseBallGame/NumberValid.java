package BaseBallGame;

import java.util.*;

public class NumberValid {
    public NumberValid () {}

    LinkedHashSet<Integer> problem = new LinkedHashSet<>();
    LinkedHashSet<Integer> answer = new LinkedHashSet<>();

    int strike;
    int ball;
    int out;

    public int getStrike() {return this.strike;}

    public void setProblem(LinkedHashSet<Integer> problem) {
        this.problem = problem;

    }

    public void setAnswer(LinkedHashSet<Integer> answer) {
        this.answer = answer;
    }

    public void reset() {
        this.strike = 0;
    }

    public void InvalidAnswer(int level) {

        //현재 비교를 위해서 LinkedHashSet -> arrayList로 변경 하였습니다.
        List<Integer> problemList = new ArrayList<>(problem);
        List<Integer> answerList = new ArrayList<>(answer);
        //problem의 배열과 answer의 배열을 비교.
        for(int i = 0; i<problemList.size(); i++) {
            for(int j = 0; j<answerList.size(); j++) {
                //만약 값이 같을경우 주소값을 비교하여 ball 인지 strike인지 구분
                if(answerList.get(i).equals(problemList.get(j))) {
                    if(i != j) {
                        ball++;
                    }
                    else {
                        strike++;
                    }
                    break;
                }
                //값이 없을 때.

            }

        }
        out = level-(strike + ball);
        System.out.println("strike = " + strike + " ball = " + ball + " out = " + out);
        if(strike == level) {
            System.out.println("Clear!!");
        }
        else {
            System.out.println("retry >> ");
            this.answer.clear();
            strike = 0;
            ball = 0;
            out = 0;

        }



    }

//현재 거의 구현은 완료 되었는데, 입력 받는 LinkedHashset이 초기화가 안됩니다.
}
