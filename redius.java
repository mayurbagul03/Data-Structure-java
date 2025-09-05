import java.util.Scanner;
public class redius {
    public static double circuference(int n){
        return n*Math.PI*2;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double rad = circuference(n);
        System.out.println("Circumtenses of this radius is :"+ rad);
        sc.close();
    }
}
