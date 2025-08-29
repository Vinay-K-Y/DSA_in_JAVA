import java.util.ArrayList;
public class ArrayListSO {
    public static void main(String[] args) {
        ArrayList<Integer> AL= new ArrayList<>();

//push operation using add method;
        AL.add(10);
        AL.add(20);
        AL.add(30);

//printing the stack
        System.out.println("--Stack--");
        for(int i=AL.size()-1;i>=0;i--){
            System.out.println(AL.get(i));
        }
//peek operation using size() and get() method
        System.out.println(AL.get(AL.size()-1)+"<-Top");

//pop operation using remove() method
      System.out.println(AL.get(AL.size()-1)+"popped");
        AL.remove(AL.size()-1);

        System.out.println("--Stack--");
        for(int i=AL.size()-1;i>=0;i--){
            System.out.println(AL.get(i));
        }

    }
}
