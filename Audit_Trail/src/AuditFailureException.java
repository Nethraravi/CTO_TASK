public class AuditFailureException extends Exception{
    private final String accountNumber;

    public AuditFailureException(String accountNumber, String message)
    {
        super(message);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }
}
