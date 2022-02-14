public class CreditCard extends Card implements IScan,IPay{


    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }

    public String scan() {
        return "Payment Successful";
    }

    public String pay(){
        return "Paid with card";
    }
}
