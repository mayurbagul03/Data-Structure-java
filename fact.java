public class fact {
    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact = factorial(n-1);
        int fact_n =n*fact;
        return fact_n;
    }

    public static void main(String arg[]){
        int n= 0;
        int ans = factorial(n);
        System.out.println(ans);
    }
}
