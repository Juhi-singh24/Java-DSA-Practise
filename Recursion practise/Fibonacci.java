//In this program we are printing Fibonacci series using Recursion✨🎉

public class Fibonacci{
  

  public static int fib(int num){

    if(num == 0 || num == 1){
      return num;
    }


  return fib(num -1) + fib(num - 2); 
}

public static void main(String[] args){

  for(int i=0;i<8;i++){

    System.out.print(fib(i)+"");

  }

}  
}
