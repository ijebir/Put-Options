import java.util.Scanner;

public class put{

        public static void main(String[] args){

                Scanner scan = new Scanner(System.in);
                System.out.println("Type short or long");
                String ls = scan.next();
                System.out.println("Type The Strike Price");
                double k = scan.nextDouble();
                System.out.println("Type The Premium");
                double p = scan.nextDouble();
                double profit = 0;
                System.out.println("What is the price of the underlying");
                double st = scan.nextDouble();
                if(ls.equals("short")){
                        profit = p + min(0, st-k);
                }
                else{
                        profit = -p + max(0, k-st);
                }
                System.out.println("You will make " + profit);
        }

        public static double max(double a, double b){
                if(a > b){
                        return a;
                }
                else{
                        return b;
                }
        }

        public static double min(double a, double b){
                if(a < b){
                        return a;
                }
                else{
                        return b;
                }
        }
}
