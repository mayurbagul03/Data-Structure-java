import java.util.Scanner;

public class Count {
    public static void userNum(int num){
        int positive =0;
        int negetive=0;
        int zero =0;
        for(int i=0; i<num;i++){
            Scanner sc =new Scanner(System.in);
            int numb = sc.nextInt();
            if (numb==0){
                zero++;
            }else if(numb>0){
                positive++;
            }else{
                negetive++;
            }
        }
        System.out.println("Positive Count " + positive);
        System.out.println("Negetive Count " + negetive);
        System.out.println("Zero Count " + zero);


    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        userNum(n);
        sc.close();
    }
}
