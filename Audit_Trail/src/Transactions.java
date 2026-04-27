import java.math.BigDecimal;

enum TransactionType
{
    CREDIT, DEBIT
}

public class Transactions {
    private final TransactionType type;
    private final BigDecimal amount;

    public Transactions(TransactionType type, BigDecimal amount)
    {
        this.type=type;
        this.amount=amount;
    }

    public BigDecimal apply(BigDecimal balance)
    {
        return type == TransactionType.CREDIT ? balance.add(amount) : balance.subtract(amount);
    }

}
