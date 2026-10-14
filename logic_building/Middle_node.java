//Finding the middle node in liked list

public class Middle_node{

  int data;
  Middle_node next;

  Middle_node(int data){
    this.data = data;
  }

  public static void main(String[] args){
    Middle_node first = new Middle_node(10);
    Middle_node second = new Middle_node(20);
    Middle_node third = new Middle_node(30);
    Middle_node fourth = new Middle_node(40);
    Middle_node fifth = new Middle_node(50);
  

    first.next=second;
    second.next =third;
    third.next = fourth;
    fourth.next = fifth;

    Middle_node head = first;
    Middle_node current = head;

    int count =0;

    while(current != null){

      current = current.next;
      count += 1;

    }

    System.out.println("Total nodes: " + count);

    int middle = count /2;
    System.out.println(middle);
    int start =0;
    Middle_node temp = head;


    while(start<middle){
      start +=1;
      temp = temp.next;
      
      
    }

    System.out.println("Middle node:" +temp.data);
    

  }

}