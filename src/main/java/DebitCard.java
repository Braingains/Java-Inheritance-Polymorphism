import com.sun.xml.internal.bind.v2.TODO;

public class DebitCard extends BankCard implements IScan {
    private int sortCode;
    private int accountNumber;
    private double balance;

    public DebitCard(String cardNumber, int sortCode, int accountNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate,securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.balance = 0;

    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String scan() {
        return "Payment Complete";
    }

    public void addFunds();
    TODO
}
