// In this program we will print numbers 1 to 10

public class Print_num {

public static int print(int num){
  if(num > 10){
    return 0;
  }

  System.out.println(num);
  return print(num + 1);
}

public static void main(String[] args){
  print(1);
}
  
}
