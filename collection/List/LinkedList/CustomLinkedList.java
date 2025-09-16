package collection.List.LinkedList;

import java.util.Vector;

public class CustomLinkedList {
    private Node head ;

    //add element at the end
    public void add(int data){
        Node newnode=new Node(data);
        
        if(head==null){
            head=newnode;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=newnode;
        }
    }

    //add element at first
    public void addfirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head = newnode;
    }

    //remove first element
    public void removefirst(){
        if(head!=null){
            head=head.next;
        }
    }

    //remove last element
    public void removelast(){
        if(head==null ||  head.next==null){
            head=null;
            return;
        }
        Node current = head;
        while(current.next.next !=null){

        }
    }








    public static void main(String[] args) {

    }
}
class Node{
    public int value;
    public Node next;

    public Node(int data){
        this.value=data;
        this.next=null;
    }
}

