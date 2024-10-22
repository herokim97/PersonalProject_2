package BaseBallGame;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class MakeNumber {
    Random random = new Random();
    LinkedHashSet<Integer> result = new LinkedHashSet<>();

    public MakeNumber() {}

    public void make(){
        // 여러 개의 랜덤 값을 HashSet에 추가
        for (int i = 0; i < 3; i++) {

            int randomValue = random.nextInt(9) + 1;// 0에서 8까지의 랜덤 값 생성
            boolean isAdded = result.add(randomValue); //중복 유무 판별.

            if(!isAdded) { // 중복일 경우 i 감소
                i--;
            }
            result.add(randomValue);  // HashSet에 값 추가
        }
    }

    public LinkedHashSet<Integer> getResult() {
        return result;
    }
}
