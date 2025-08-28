public class singlyLinkedList {
    Node head;
    class Node{
        int data;
        Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
    }


//adding node in the beginning of the linked list
public void addBEginning(int data){
    Node newnode = new Node(data);
    // if (head == null){
    //     head = newnode;
    // }
    newnode.next = head;
    head = newnode;
}

//delete a node at beginning;
public void delBegining(){
    if (head==null){
        System.out.println("Empty list");
        return;
    }
    head=head.next;
}

//adding a node at the last of a linked list
public void addEnd(int data){
    Node newnode = new Node(data);
    if (head == null){
        head =newnode;
    }else{
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
    }
}

//delete a node at the end of the list
public void delEnd(){
    if (head==null){
        System.out.println("Empty list");
        return;
    }
    if (head.next==null){
        head = null;
        return;
    }
    Node current = head;
    while(current.next.next!=null){
        current=current.next;
    }
    current.next=null;
}

//adding node in between of the list
public void addMiddle(int target,int data){
    Node newnode = new Node(data);
    if (head == null){
        head =newnode;
    }else{
        Node current= head;
        while(current.data!=target){
            current=current.next;
        }
        newnode.next=current.next;
        current.next=newnode;
    }
}

//delete a node with target value
public void deltarget(int target){
    Node current = head;
    Node prev = null;
    if (head==null){
        System.out.println("Empty list");
        return;
    }
    if (head.next==null){
        head = null;
        return;
    }
    while(current.data!=target){
        prev = current;
        current=current.next;
    }
    prev.next=current.next;

}

//printing the list
public void Printlist(){
    Node current=head;
    while(current.next!=null){
        System.err.print(current.data + "->");
        current=current.next;
    }
    System.out.print(current.data+"->");
    System.err.print("null");
    System.err.println();
}


public static void main(String[] args) {
    singlyLinkedList LL= new singlyLinkedList();
    LL.addBEginning(20);
    LL.addBEginning(10);
    LL.addEnd(30);
    LL.addBEginning(5);
    LL.addMiddle(10, 15);
    LL.Printlist();
    LL.delBegining();
    // LL.delEnd();
    LL.deltarget(20);
    LL.Printlist();
}
}

