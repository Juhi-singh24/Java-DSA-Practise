//In this program we are going to remove duplicates  using Recursion.

import java.util.*;
public class Remove_duplicates {

  public static void remove(String str,int index,String newstr,boolean[] map){

    if(index == str.length()){
      System.out.println(newstr);
      return;
    }

    char currchar = str.charAt(index);
    int position = currchar - 'a';

    if(map[position]){

      remove(str,index+1,newstr,map);    
  }

  else{
    map[position] = true;
    remove(str,index +1,newstr + currchar,map);

  }

}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the string:");
    String str = sc.nextLine();

    boolean[] map = new boolean[26];


    remove(str,0,"",map);

    sc.close();
  
  }
  
}
