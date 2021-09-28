import java.lang.Math;

public class PaymentCalculator {
    private final double BALANCE, MONTHLY_PAYMENT, DAILY_RATE;

    PaymentCalculator(double balance, double apr, double monthlyPayment){
        BALANCE = balance;
        DAILY_RATE = apr / 100.0 / 365.0;
        MONTHLY_PAYMENT = monthlyPayment;
    }

    public double calculateMonthsUntilPaidOff(){
        return Math.ceil((-1/30.0) * Math.log(1 + BALANCE / MONTHLY_PAYMENT * (1 - Math.pow((1 + DAILY_RATE), 30)) ) / Math.log(1 + DAILY_RATE));
    }

}
