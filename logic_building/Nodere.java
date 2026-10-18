//In this problem we are removing the Nth node from the linked list using the slow and fast pointer with the help of dummy node.

public class Nodere {
  int data;
  Nodere next;

  Nodere(int data){
    this.data = data;
  }

  static Nodere removeKnode(Nodere head,int k){

    if(head == null ||  k<1){
      return null;
    } 

    Nodere dummy = new Nodere(0);
    dummy.next=head;

    Nodere slow = dummy;
    Nodere fast = dummy;

    for(int i=0; i<k+1 ;i++){
       if(fast == null){
        return null;
      }

      fast = fast.next;
    }

    while(fast != null){
      fast =fast.next;
      slow=slow.next;
    }

    slow.next = slow.next.next;

    return dummy.next;


  }

  public static void main(String[] args){
    Nodere first =  new Nodere(10);
    Nodere second = new Nodere(20);
    Nodere third = new Nodere(30);

   
    first.next=second;
    second.next = third;

     Nodere head = first;
     int k=3;

     head = removeKnode(head,k);
     Nodere current = head;

     System.out.println("After removing the Nth node from Linked List : ");

     while(current!= null){
      System.out.print(current.data +" ");
      current = current.next;

     }
  }
  
}
