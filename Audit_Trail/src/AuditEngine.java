import java.util.Iterator;
import java.util.List;

public class AuditEngine {
    private final List<AuditRule> rules;

    public AuditEngine(List<AuditRule> rules)
    {
        this.rules=rules;
    }

    public void audit(Iterator<Account> iterator) throws AuditFailureException
    {
        while(iterator.hasNext())
        {
            Account acc = iterator.next();
            for(AuditRule rule : rules)
            {
                rule.check(acc);
            }
        }
    }
}
