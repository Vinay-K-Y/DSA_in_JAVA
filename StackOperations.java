public class StackOperations {
    int top;
    int capacity;
    int[] a;

    StackOperations(int capacity){
        this.capacity=capacity;
        top =-1;
        a = new int[capacity];
    }

//pushing a element into the stack
    public void push(int data){
        if(top >= capacity-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        a[top]=data;
    }

//pop a element from the stack 
    public void pop(){
        if(top<0){
            System.err.println("Stack is empty");
            return;
        }
        top --;
    }

//peek into the stack i.e check where the top pointer is pointing
    public void  peek(){
        if(top<0){
            System.err.println("Stack is empty");
            return;
        }
        System.out.println(a[top]+"<-top");
    }

//printing th stack 
    public void printStack(){
        if(top<0){
            System.err.println("Stack is empty");
            return ;
        }
        for (int i=top;i>=0;i--){
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) {
        StackOperations SO = new StackOperations(4);
        SO.push(10);
        SO.push(20);
        SO.push(30);
        SO.push(40);
        SO.printStack();
        SO.push(50);
        // SO.printStack();
        SO.pop();
        SO.peek();
        SO.printStack();
        SO.pop();
        SO.pop();
        SO.pop();
        SO.pop();

    }

}