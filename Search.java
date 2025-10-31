import java.util.Scanner;

public class Search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[]= new int[size];
        int find_num = sc.nextInt();


        for (int i =0; i<size;i++){
            number[i]=sc.nextInt();
        }
         System.out.println("Number Entered by User");
        for (int i=0;i<number.length;i++){
             if (find_num == number[i]){
                System.out.println(i);
             }
        }
    }
}
