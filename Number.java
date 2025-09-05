import java.util.Scanner;
public class Number {

     public static int gretest(int n,int r){
        if (n>r){
            return n;
        }else{
            return r;
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r= sc.nextInt();
        
        int bigval = gretest(n,r);
        System.out.println("Gretter Number is:"+ bigval);
        sc.close();
    }

}
