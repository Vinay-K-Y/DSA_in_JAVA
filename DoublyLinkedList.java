public class DoublyLinkedList{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

//adding a node at the beginning 
    public void addBegin(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail=newnode;
        }
        newnode.next=head;
        head.prev=newnode;
        head = newnode;
    }

//deleting a node from beginning 
    public void delBegin(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.prev= null;
    }

//adding a node at the end
    public void addEnd(int data){
        Node newnode = new Node(data);
        Node current = head;
        if(head == null){
            head = newnode;
            tail= newnode;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail =  newnode;
    }

//deleting a node at the end 
    public void delEnd(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        tail = tail.prev;
        tail.next=null;
    }

//adding a node in between of the of the list
    public void addMiddle(int target,int data){
        Node newnode = new Node(data);
        Node current = head;
        if(head == null){
            head = newnode;
            head.next= newnode;
        }
        while(current.data!=target){
            current = current.next;
        }
        if(current == head){
            addBegin(data);
            return;
        }
        if(current == tail){
            addEnd(data);
            return;
        }
        newnode.next=current.next;
        current.next.prev=newnode;
        current.next = newnode;
        newnode.prev = current;
    }

//deleting a node in between the list
    public void delMiddle(int target){
        Node current = head;
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        while(current.data!=target){
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

//printing the list
    public void printList(){
        Node current = head;
        while(current.next!=null){
            System.out.print(current.data+"<->");
            current = current.next;
        }
        System.out.print(current.data+"<->");
    System.err.print("null");
    System.err.println();
    }

    public static void main(String[] args){
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.addBegin(10);
        DLL.addBegin(7);
        DLL.addBegin(5);
        DLL.addEnd(15);
        DLL.addMiddle(15, 17);
        DLL.addEnd(20);
        DLL.addMiddle(10, 12);
        DLL.printList();
        DLL.delBegin();
        DLL.printList();
        DLL.delMiddle(17);
        DLL.delBegin();
        DLL.delEnd();
        DLL.printList();
    }
}