public class recurssion {

//factorial of n number
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }

//print first n natural numbers
    public static void natural(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        natural(n-1);
    }

//fibonacci series
    public static void fibonacci(int a,int b,int n){
        if (n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }
    
//sum of first n natural numbers;
    public static int NSum(int n){
        if(n==0){
            return 0;
        }
        int sum = n + NSum(n-1);
        return sum;
    }
    public static void main(String[] args){
        int n = 5;
        int a =0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fibonacci(a, b, n);
        // int sum = NSum(n);
        // System.err.println(sum);
    }
}