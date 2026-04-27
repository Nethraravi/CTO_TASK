import java.math.BigDecimal;

interface AuditRule
{
    void check(Account account) throws AuditFailureException;
}

public class NegativeBalanceAudit implements AuditRule
{
    public void check(Account account) throws AuditFailureException
    {
        if(account.getBalance().compareTo(BigDecimal.ZERO)<0)
        {
            throw new AuditFailureException(
                    account.getAccountNumber(),
                    "Negative balance detected"
            );
        }
    }
}
