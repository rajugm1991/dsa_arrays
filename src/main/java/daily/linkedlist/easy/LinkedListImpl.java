package daily.linkedlist.easy;

public class LinkedListImpl {

    Node head;
    Node tail;
    int size;

    public void addFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;

    }

    public void insertLast(int data){
        Node node=new Node(data);
        if(tail==null){
            addFirst(data);
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }

    public Node deleteFirst(){
        Node node=null;
        if(head!=null){
            node=head.next;
            head=node;
            size--;
        }
        return node;
    }

    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public void checkValidIndex(int index){
        if(index>size){
            throw new IllegalArgumentException("Invalid input passed");
        }
    }

    public void insertAt(int index,int data){
        checkValidIndex(index);
        if(index==0){
            addFirst(index);
        }
        Node temp=getPrevIndexNode(index);
        Node node=new Node(data);
        if(temp!=null){
            node.next=temp.next;
            temp.next=node;
            size++;
        }
    }

    public Node getPrevIndexNode(int index){
        if(index>size){
            throw new IllegalArgumentException("Invalid input passed");
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        return temp;
    }

    public Node deleteAt(int index){
        if(index>size){
            throw new IllegalArgumentException("Invalid input passed");
        }
        if(index==0){
            return deleteFirst();
        }
        Node temp=getPrevIndexNode(index);
        Node delete=null;
        if(temp.next!=null){
            delete=temp.next.next;
            temp.next=delete;
            size--;
        }
        return delete;
    }

    public static void main(String[] args) {
        LinkedListImpl linkedList=new LinkedListImpl();
        linkedList.addFirst(12);
        linkedList.addFirst(90);
       // linkedList.printList();
        linkedList.insertLast(100);
        linkedList.printList();
        System.out.println("delete first node");
        linkedList.deleteFirst();
        linkedList.printList();
        System.out.println();
        System.out.println("Second node "+linkedList.getPrevIndexNode(1).data);
        linkedList.insertLast(90);
        linkedList.insertLast(91);
        System.out.println();
        linkedList.printList();
        linkedList.deleteAt(2);
        linkedList.printList();
        System.out.println(linkedList.size);
        System.out.println();
        linkedList.insertAt(1,1);
        linkedList.printList();
        linkedList.insertAt(4,2);
        linkedList.printList();


    }
}

class Node{

    int data;
    Node next;

    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this(data,null);
    }

}
