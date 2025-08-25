import java.util.*;

//creating a user defined function to perfrom a perticular task
//This function gives the factorial of a number;
public class Function {
    public static int Fact(int n){
        int x=1;
        for (int i=n;i>0;i--){
            x = x*i;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // using scanner class for taking user inputs
        int n = sc.nextInt();//taking user input of integer
        int Sum = Fact(n);
        System.err.println(Sum);
    }
}
