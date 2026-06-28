// In this program we are going to find out the substring of a String using Backtracking.


public class Stringsub{

  public static void Subset(String str,int index,String current){

    if(index == str.length()){

      System.out.println(current);
      return;

    }

    Subset(str,index+1,current + str.charAt(index));

    Subset(str,index+1,current);
  }

public static void main(String[] args) {
  Subset("abc",0,"");
}
  
}
