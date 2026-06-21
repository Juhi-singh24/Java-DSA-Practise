//In this program we are going to arrange all the 'x' present in string at the end.


public class char_arranged{

  public static String charal(String alpha,int index){

    if(index == alpha.length()){

      return "";
    }

    String charalp = charal(alpha,index+1);

    if(alpha.charAt(index) != 'x'){
      return alpha.charAt(index)+ charalp;
    }

    else{
      return charalp + alpha.charAt(index);
    }
  }

  public static void main(String[] args) {
    String chara = "axbcxacx";
    String result = charal(chara,0);

    System.out.println(result);
  }
  
}