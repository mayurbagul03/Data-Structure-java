public class Recursion {
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);

    }

    public static void main(String arg[]){
        printSum(1,5, 0);
    }
    
}
