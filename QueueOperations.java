import java.util.LinkedList;
import java.util.Queue;
public class QueueOperations {
    static Queue<Integer> q = new LinkedList<>();

    static boolean isEmpty(){
        return q.isEmpty();
    }

    static void Enqueue(int data){
        q.add(data);
    }

    static void Dequeue(){
        if(isEmpty()){
            return;
        }
        q.poll();
    }

    static  int Front(){
        if(isEmpty()){
            return -1;
        }
        return q.peek();
    }

    static int Rear(){
        if(isEmpty()){
            return -1;
        }
        return ((LinkedList<Integer>) q).getLast();//makes q as linked list and then uses getLast() method to get last element
    }


    static void Print(){
        for (int i:q){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Front :"+Front());
        System.out.println("Rear :"+Rear());
    }
    public static void main(String[] args) {
        Enqueue(1);
        Enqueue(2);
        Enqueue(3);
        Enqueue(4);
        Enqueue(5);
        Print();
        Dequeue();
        Print();
}
}

//as we are using Dyanmically initialized Queue isFull() operation becomes void;