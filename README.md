야구 게임 입니다!
난이도를 선택하고 스트라이크로 게임에서 승리하세요!
게임별 시도 횟수를 통해 클리어 속도를 파악 할 수 있습니다.

조금 더 많은 정보가 있었다면 코드의 간결화가 되었을 텐데 아쉽습니다
메인 포함 5개의 Class로 구한하였으며,
1) Main Class
2) GameStart Class - 게임 시작
3) NumberValid Class - 숫자 검증
4) MakeNumber Class - 랜덤 숫자 생성
5) GameLog Class - 게임 결과 기록
위처럼 기능에 따라 객체를 구분하였습니다.

문제, 답변 자료형은 중복 미 허용과 순서 보장을 위해 LinkedHashSet을 사용하였으며, 게임 로그를 저장하는 자료형은 Key-Value를 위해 사전형 자료형을 사용했습니다.

정답을 알고 싶다면, GameStart.gameReset() 내, 주석처리된 print 코드를 활성화 하십시오.
