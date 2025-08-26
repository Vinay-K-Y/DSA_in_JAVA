import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.next(); //takes only 1 word and if found space terminates there
        String full_name= sc.nextLine();//takes full line as input


 // prints each character 
    String firstname = "tony Stark";
    for (int i = 0 ;i<firstname.length();i++){
        System.out.println(firstname.charAt(i));
    }
    
 //comparassion of 2 strings 
// strings are treated as objects in java thus cannot use "==" to compare 2 strings
    String name1 =" VINAY ";
    String name2 = " VIRAJ";
    if (name1.compareTo(name2)==0){
        System.out.println("Strings are same");
    }else {
        System.err.println("Strings arent same ");
    }
    
// Slicing a string and creating a substring 

    String a="hello This is a test message";
    String b= a.substring(6,a.length());
    String c = b.substring(10,b.length());
    System.out.println(b);
    System.out.println(c);

//Strings are immutable in java so they introduced string builder
    StringBuilder sb = new StringBuilder("Vinay");
    System.out.println(sb);
//set chat at position
    sb.setCharAt(0,'B');
    System.out.println(sb);

//inserting character
    sb.insert(0, "V");
    System.out.println(sb);

//inserting string 
    sb.insert(0, "hello ");
    System.out.println(sb);
    
//deleting 
    sb.delete(7,8);
    System.out.println(sb);

//appending a string    
    sb.append("how are you");
    System.out.println(sb);



//string reversal
    String input = sc.nextLine();
    StringBuilder z =  new StringBuilder(input);
    for (int i=0;i<z.length()/2;i++){
        int front = i;
        int rear = z.length()-1-i;

        char frontChar = z.charAt(front);
        char rearChar = z.charAt(rear);

        z.setCharAt(front, rearChar);
        z.setCharAt(rear, frontChar);
    }
    System.out.println(z);

}
}