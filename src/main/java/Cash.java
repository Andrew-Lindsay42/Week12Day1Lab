public class Cash implements IItem, IPay{

    private int value;
    private String currencyType;

    public Cash(int value, String currencyType) {
        this.value = value;
        this.currencyType = currencyType;
    }

    public int getValue() {
        return value;
    }

    public String getCurrencyType() {
        return currencyType;
    }
}
