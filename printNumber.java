import java.util.Scanner;

public class printNumber {
    public static void Scannumber(int n){
        if(n==0){
            return;
        }else{
            System.out.println(n);
            Scannumber(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Scannumber(n);
        sc.close();
    }
}
