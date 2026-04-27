public abstract class Loan {
    protected double principal;
    protected double rate;
    protected int duration;

    public Loan(double principal, double rate, int duration)
    {
        this.principal=principal;
        this.rate=rate;
        this.duration=duration;
    }
    abstract double calculate_interest();
}