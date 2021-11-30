# 로또

## 요구사항
- 구입 금액 입력
- 구입 금액에 따라 1장에 1000원씩 계산하여 로또 발급하기
- 로또 한장에는 6개의 숫자가 담겨있다
- 수동으로 구매한 로또 수 입력
- 수동 로또수에 따라 하나의 로또당 6개의 번호를 입력해야함
- 수동 로또를 제외하여 나머지는 자동 로또 발급
-지난 주 당첨 번호와 보너스볼을 입력
- 당첨번호와 보너스볼과 일치하는 개수에 따라 통계를 내기
- 통계에는 3개 일치, 4개 일치, 5개 일치, 5개 일치 + 보너스볼 , 6개 일치하는 로또 개수를 보여주고, 수익률을 계산한다.(기준 1)

## 구현해야 하는 기능 목록

# 플레이어
- 금액을 입력한다.
- 수동으로 몇 장을 살 건지 입력한다.
- 수동으로 티켓의 번호를 찍는다.

# 로또기계
- 자동으로 티켓의 번호를 찍는다.
- 수동 + 자동으로 찍은 모든 티켓을 보여준다.
- 지난 주 당첨 번호를 입력받는다.
- 보너스볼을 입력한다.
- 결과를 계산해서 전달한다.

# 로또티켓
- 6개의 번호에 중복이 없는지를 확인한다.
- 티켓에 찍힌 번호들을 양식에 맞게 반환한다.

# 로또공
- 해당 공 또는 번호가 범위 안에 있는지를 확인한다.


### 💻 프로그래밍 실행 결과 예시
```
구입금액을 입력해 주세요.
14000

수동으로 구매할 로또 수를 입력해 주세요.
3

수동으로 구매할 번호를 입력해 주세요.
8, 21, 23, 41, 42, 43
3, 5, 11, 16, 32, 38
7, 11, 16, 35, 36, 44

수동으로 3장, 자동으로 11개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6
보너스 볼을 입력해 주세요.
7

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
총 수익률은 35.7%입니다.
```