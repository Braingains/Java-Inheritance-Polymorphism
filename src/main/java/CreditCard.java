public class CreditCard extends BankCard implements IScan {

    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }

        public String scan(){
            return "Payment Successful";
    }

}
