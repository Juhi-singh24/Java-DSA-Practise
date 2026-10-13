//This is a program of single linked list in which we are finding the target in linked list and then deleting that node from linked list.

public class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
  }

  public static void main(String[] args){
    Node first = new Node(10);
    Node second = new Node(20);
    Node third = new Node(30);
    Node fourth = new Node(40);

    first.next = second;
    second.next = third;
    third.next = fourth;

    Node head = first;
    Node previous = null;
    Node current = head;
    int target = 30;

    while(current != null){

      if(current.data == target){
        previous.next = current.next;
        break;
      }

      previous =current;
      current = current.next;
     
    }

    Node temp = head;
    while(temp != null){
      System.out.println(temp.data);
      temp = temp.next;
    }

  }

}