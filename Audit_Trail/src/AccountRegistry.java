import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class AccountRegistry {
    private final Map<String, Account> accounts=new LinkedHashMap<>();

    public void register(Account account)
    {
        String accNo = account.getAccountNumber();
        if(accounts.containsKey(accNo))
        {
            throw new DuplicatedAccountException(accNo);
        }
        accounts.put(accNo, account);
    }


    public Optional<Account> find(String accountNumber)
    {
        return  Optional.ofNullable(accounts.get(accountNumber));
    }

    public Collection<Account> getAllAccounts()
    {
        return accounts.values();
    }
}
