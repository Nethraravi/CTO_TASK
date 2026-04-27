public class Auto extends Loan {
    public Auto(double principal, double rate, int duration)
    {
        super(principal,rate,duration);
    }
    public double calculate_interest()
    {
        double interest=principal*rate*duration/100;
        double processingFee=interest*0.01;
        System.out.println("Auto Loan interest is: "+(interest+processingFee));
        return interest+processingFee;
    }
}
