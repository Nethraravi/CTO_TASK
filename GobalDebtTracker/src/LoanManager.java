import java.util.ArrayList;
import java.util.List;

public class LoanManager {
    private List<Loan> loan; //encapsulation
    public LoanManager()
    {
        loan= new ArrayList<>();
    }
    public void addLoan(Loan loans)

    {
        loan.add(loans);
    }
    public double CalculateTotalInterest()
    {
        double total=0;
        for(Loan loans : loan)
        {
            total+=loans.calculate_interest(); //polymorphism -> though loan is Loan's object it calls the correct method at runtime.
        }
        return total;
    }
}
