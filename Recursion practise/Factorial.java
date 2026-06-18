//In this progrm we are going to find factorial using recursion

public class Factorial {

  public static int fact(int num){

    if(num == 0){
      return 1;
    }

    return num * fact(num - 1);



  }

  public static void main (String[] args){

    int factorial = fact(5);

    System.out.println("Factorial of 5:"+ factorial);
  }
  
}
