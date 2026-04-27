import java.util.*;

public class App {
    public static void main(String[] args)
    {
        LoanManager manager = new LoanManager();

        manager.addLoan(new PersonalLoan(100000,0.10,2)); //upcasting -> subclass object is treated as its parent type.
        manager.addLoan(new Mortgage(500000,0.08,5));
        manager.addLoan(new Auto(300000,0.08,4));

        double interest=manager.CalculateTotalInterest();
        System.out.println("Total interest is: "+interest);
    }
}