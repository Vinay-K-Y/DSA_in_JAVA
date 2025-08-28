public class CircularlyLinkedList {
    Node head;
    Node last;
    class Node{
        int data;
        Node next;

    Node(int data){
        this.data=data;
        this.next=null;
        }
    }

//add a node at the beginning 
    public void addBegin(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            last = newnode;
            newnode.next = head; 
            return;
        }
        newnode.next=head;
        head = newnode;
        last.next=head;
    }

//add a node at the end
    public void addLast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            last = newnode;
            newnode.next = head;
            return;
        }
        newnode.next = head;
        last.next = newnode;
        last = newnode;
    }

//add a node in between
    public void addMiddle(int target,int data){
        Node newnode = new Node(data);
        Node current = head;
        do { 
            if (current.data == target){
                newnode.next = current.next;
                current.next=newnode;
            }
            current = current.next;
        } while (current!=head);
        
        if(current==head){
            addBegin(data);
            return;
        }
        if(current == last){
            addLast(data);
            return;
        }
    }

//printing the list
    public void printList(){
        Node current = head;
        while(current.next!=head){
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.print(current.data+"->");
        System.err.print(current.next.data);
    System.err.print("(head)");
    System.err.println();
    }
    public static void main(String[] args) {
        CircularlyLinkedList CLL = new CircularlyLinkedList();
        CLL.addBegin(5);
        CLL.addLast(10);
        CLL.addBegin(2);
        CLL.addMiddle(10, 7);
        CLL.addLast(12);
        CLL.addMiddle(12, 15);
        CLL.printList();
    }
}
