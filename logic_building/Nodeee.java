public class Nodeee{
  int data;
  Nodeee next;

  Nodeee(int data){
    this.data = data;
  }

  static Nodeee findNodee(Nodeee head,int k){

    if(head == null ||  k<1){
      return null;
    }

    Nodeee slow=head;
    Nodeee fast = head;

    for(int i=0; i<k ;i++){
      if(fast==null){
        return null;
      }

      fast=fast.next;
    }

    while(fast != null){
      slow = slow.next;
      fast = fast.next;
    }

    return slow;
  }



  public static void main (String[] args){

    Nodeee first = new Nodeee(10);
    Nodeee second = new Nodeee(20);
    Nodeee third = new Nodeee(30);

    first.next = second;
    second.next= third;

    Nodeee head = first;
    int k =3;

    Nodeee result = findNodee(head, k);

    System.out.println("The third Node from the end :" +result.data);
  }
  
}
