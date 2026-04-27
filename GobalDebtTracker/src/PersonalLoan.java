public class PersonalLoan extends Loan {
    public PersonalLoan(double principal, double rate, int duration)

    {
        super(principal,rate,duration);
    }
    public double calculate_interest()
    {
        double intrest=principal*rate*duration;
        System.out.println("Personal Loan interest is: "+intrest);
        return intrest;
    }
}
