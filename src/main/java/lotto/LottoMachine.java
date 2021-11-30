package lotto;

import java.util.ArrayList;

import view.InputView;
import view.OutPutView;

public class LottoMachine {
	ArrayList<LottoTicket> lottoTickets;
	ArrayList<Integer> winningNum = new ArrayList<>();
	Result result = new Result();
	int bonusBall;

	public LottoMachine(ArrayList<LottoTicket> lottoTickets) {
		this.lottoTickets = lottoTickets;
	}

	public void makeAutoLottoTickets(int autoLottoCnt) {
		for (int i = 0; i < autoLottoCnt; i++) {
			lottoTickets.add(new LottoTicket());
		}
	}

	public void showAllTickets(int manualCnt, int autoCnt) {
		OutPutView.showManualAndAutoCnt(manualCnt, autoCnt);
		lottoTickets.stream().forEach(lottoTicket -> OutPutView.showThisTicket(lottoTicket));
	}

	public void getResult() {
		String[] inputWinningNum = InputView.enterWinningNum();
		validateWinningNum(inputWinningNum);
		makeWinningNum(inputWinningNum);
		compareAllPurchasedTicketAndWinningNum();
		result.getResult();

	}

	private void compareAllPurchasedTicketAndWinningNum() {
		bonusBall = InputView.enterBonusBall();
		validateBonusBall(bonusBall);
		compareEachTicketAndWinningNum();
	}

	private void compareEachTicketAndWinningNum() {
		for (LottoTicket lottoTicket : lottoTickets) {
			int matchingCnt = lottoTicket.compareWinningNum(winningNum);
			boolean matchBonusBall = lottoTicket.hasBonusBall(bonusBall);
			Rank rank = Rank.valueOf(matchingCnt, matchBonusBall);
			result.addRank(rank);
		}
	}

	private void validateBonusBall(int bonusBall) {
		new LottoBall(bonusBall);
		cantOverlapBonusBallAnyWinningNumDigit(bonusBall);
	}

	private void cantOverlapBonusBallAnyWinningNumDigit(int bonusBall) {
		if (winningNum.stream().anyMatch(winningNumDigit -> winningNumDigit == bonusBall)) {
			throw new IllegalArgumentException("보너스볼이 당첨 번호의 숫자와 겹칩니다.");
		}
	}

	private void validateWinningNum(String[] inputWinningNum) {
		new LottoTicket(inputWinningNum);
	}

	private void makeWinningNum(String[] inputWinningNum) {
		for (String s : inputWinningNum) {
			int eachDigitWinningNum = Integer.parseInt(s);
			winningNum.add(eachDigitWinningNum);
		}
	}
}
