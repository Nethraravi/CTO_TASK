

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {
    public static final  int MONTH_IN_A_YEAR =12;
    public static void main(String args[])
    {
        System.out.println("===========CREDIT SCORE QUALIFIER==========");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Credit score(300 to 900): ");
        int score=sc.nextInt();
        System.out.println("Enter your annual income: ");
        double income=sc.nextDouble();//use big decimal
        double inc=income/12;//don't hard code

        //USE WITCH
        if(canApprove(score, inc)) {
            System.out.println("Congratulations, Loan approved!");
        }
        else if(score>=600 && score<700) {
            System.out.println("Please wait, Your loan processing is under manual Review!");
        }
        else {
            System.out.println("Sorry! Your loan has been rejected due to insufficient credit score or annual income.");
        }
    }

    private static boolean canApprove(int score, double inc) {
        return score >= 700 && inc > 30000;
    }
}
