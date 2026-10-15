//Here we are merging two linked list in sorted form using two pointers.

import java.util.Scanner;

public class Nodee {
  int data;
  Nodee next;

  Nodee(int data) {
    this.data = data;
  }

  static Nodee createList(Scanner sc, int n) {

    Nodee head = null;
    Nodee tail = null;

    for (int i = 0; i < n; i++) {

      System.out.print("Enter the node value:");
      int value = sc.nextInt();
      Nodee newNode = new Nodee(value);

      if (head == null) {
        head = newNode;
        tail = newNode;
      }

      else {
        tail.next = newNode;
        tail = newNode;
      }

    }

    return head;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of nodes for linked list 1:");
    int n = sc.nextInt();
    Nodee head1 = createList(sc, n);

    System.out.print("The number of nodes for linked list 2:");

    int m = sc.nextInt();
    Nodee head2 = createList(sc, m);

    Nodee current1 = head1;
    Nodee current2 = head2;

    Nodee tail = null;
    Nodee head = null;

    while (current1 != null && current2 != null) {

      if (current1.data > current2.data) {
        if (head == null) {
          head = current2;
          tail = current2;
          current2 = current2.next;
        } else {
          tail.next = current2;
          tail = current2;
          current2 = current2.next;

        }

      }

      else {
        if (head == null) {
          head = current1;
          tail = current1;
          current1 = current1.next;
        }

        else {

          tail.next = current1;
          tail = current1;
          current1 = current1.next;

        }
      }

    }

    if (current1 == null) {
        tail.next = current2;
      } else {
        tail.next = current1;

      }

      Nodee current = head;
       System.out.print("Merged linked list :");
       while(current != null){
        System.out.print(current.data  + " ");
        current=current.next;
       }
  }

}
