public class Main{
  int c=5;
  int d=8;

  void swap(){
    int temp = c;
    c = d;
    d = temp;
    
  }
  
  public static void main(String[] args){
    Main sw = new Main();
    
    System.out.println("Before Swapping");
    System.out.println(sw.c);
    System.out.println(sw.d);

    sw.swap();

    System.out.println("After swapping");
    System.out.println(sw.c);
    System.out.println(sw.d);
  }
}
