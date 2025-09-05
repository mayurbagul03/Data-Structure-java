import java.util.Scanner;

public class Vote {
    public static void vote(int num){
        if (num>=18){
            System.out.println("Eligible For vote");
        }else{
            System.out.println("Not Eligible For Vote");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        vote(n);
        sc.close();
    }
}
