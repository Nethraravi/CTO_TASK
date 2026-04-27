

public class Mortgage extends Loan {
    public Mortgage(double principal, double rate, int duration)
    {
        super(principal,rate,duration);
    }
    public double calculate_interest()
    {
        double intrest= principal*Math.pow((1+rate),duration)-principal;
        System.out.println("Mortgage interest is: "+intrest);
        return intrest;
    }
}
