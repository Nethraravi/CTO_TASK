import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String accountNumber;
    private final String holderName;
    private BigDecimal balance;
    private final List<Transactions> transactions = new ArrayList<>();

    public Account(String accountNumber, String holderName, BigDecimal initialBalanace)
    {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        balance=initialBalanace;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    public void credit(BigDecimal amount)
    {
        Transactions tx = new Transactions(TransactionType.CREDIT, amount);
        balance=tx.apply(balance);
        transactions.add(tx);
    }

    public void debit(BigDecimal amount)
    {
        Transactions tx = new Transactions(TransactionType.DEBIT, amount);
        balance=tx.apply(balance);
        transactions.add(tx);
    }
}
