package lotto.constant;

public class LottoMessage {

    private static final String PURCHASE_AMOUNT_INPUT = "구입금액을 입력해 주세요.";
    private static final String PURCHASE_COUNT_MESSAGE = "%d개를 구매했습니다.";
    private static final String EMPTY = "";

    public static String getPurchaseAmountInputMessage() {
        return PURCHASE_AMOUNT_INPUT;
    }

    public static String getPurchaseCountMessage(Integer purchaseCount) {
        return String.format(PURCHASE_COUNT_MESSAGE, purchaseCount);
    }

    public static String getEmpty() {
        return EMPTY;
    }
}
