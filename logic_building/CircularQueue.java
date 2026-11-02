//Implementing the queue
class CircularQueue{
  int[] queue;
  int capacity;
  int front=-1;
  int rear=-1;

  CircularQueue(int capacity){
    this.capacity = capacity;
    queue = new int[capacity];
  }

  boolean isEmpty(){
      if(front == -1){
      return true;
    }

    else{
      return false;
    }

    }

    boolean isFull(){
      if((rear+1) % capacity == front){
        return true;

      }

      else{
        return false;
      }
    }

  void enqueue(int value){

    if(isEmpty()){

      front=0;
      rear=0;

      queue[rear] = value;


    }

    else if(isFull()){
      System.out.println("Queue is full");
      return;
    }

    else{
    rear = (rear+1) % capacity;

    queue[rear] = value;
    
    
  }
}

void dequeue(){
  if(isEmpty()){
    System.out.println("Queue is Empty");
    return;
  }

  else if(front == rear){
    front=-1;
    rear=-1;
  }

  else{
    front = (front+1) % capacity;
  }

}

void display() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }

    int i = front;

    while (true) {
        System.out.print(queue[i] + " ");

        if (i == rear) {
            break;
        }

        i = (i + 1) % capacity;
    }

    System.out.println();
}

  public static void main(String[] args){
    CircularQueue obj = new CircularQueue(5);
    obj.enqueue(5);
    obj.enqueue(10);
    obj.enqueue(15);
    obj.enqueue(20);

    obj.dequeue();
    obj.dequeue();

    obj.display();


  }
}