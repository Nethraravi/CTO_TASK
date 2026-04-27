public class DuplicatedAccountException extends  RuntimeException{
    DuplicatedAccountException(String accNo)
    {
        super("Duplicate account: "+accNo);
    }
}
