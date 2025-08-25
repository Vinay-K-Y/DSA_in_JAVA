import java.util.*;
public class patterns {
    public static void Righthalfpattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
}

    public static void lefthalfpattern(int n){
        int i,j;
        for (i=n;i>=0;i--){
            for ( j=0;j<i;j++){
                System.out.print(" ");
            }
            for( j=0;j<n-i;j++){
            System.out.print("*");
            }
        System.out.println();
        }
    }


    public static void Square(int n ){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==0||j==0||i==n-1||j==n-1){
                    System.err.print("*");
                }else 
                    System.err.print(" ");
            }
            System.out.println();
        }
    }

    public static void SolidSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.err.println();
    }
}


    public static void pyramid(int n){
        for (int i =0;i<n;i++){
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Select a pattern:\n1.Righthalfpattern\t2.lefthalfpattern\t3.Square\t4.SolidSquare\t5.pyramid");
    int choice=sc.nextInt();
    System.out.println("Choose the size for pattern:");
    int n=sc.nextInt();

    switch (choice) {
        case 1:
            Righthalfpattern(n);
            break;
        case 2:
            lefthalfpattern(n);
            break;
        case 3:
            Square(n);
            break;
        case 4:
            SolidSquare(n);
            break;
        case 5:
            pyramid(n);
            break;
        default:
            System.err.println("Invalid choice");
            break;
    }
        }
    }

