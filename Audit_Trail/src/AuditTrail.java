import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AuditTrail {
    public static void main(String[] args)
    {
        AccountRegistry registry = new AccountRegistry();

        Account a1 = new Account("A101", "John",new BigDecimal("5000.00"));
        Account a2 = new Account("A102", "Jack", new BigDecimal("2000.00"));
        Account a3 = new Account("A103", "Bob", new BigDecimal("3000.00"));

        a2.debit(new BigDecimal(2500));
        a3.debit(new BigDecimal(3500));

        registry.register(a1);
        registry.register(a2);
        registry.register(a3);

        AuditEngine engine=new AuditEngine(
                List.of(new NegativeBalanceAudit())
        );

        List<String> failedAccounts = new ArrayList<>();
        Iterator<Account> iterator = registry.getAllAccounts().iterator();

        while (true)
        {
            try {

                engine.audit(iterator);
                break;

            } catch (AuditFailureException e) {
                System.out.println("Audit Failure: "+e.getAccountNumber());
                failedAccounts.add(e.getAccountNumber());
            }
        }
        System.out.println("Audit Completed. Failed Accounts: "+failedAccounts);
    }
}
