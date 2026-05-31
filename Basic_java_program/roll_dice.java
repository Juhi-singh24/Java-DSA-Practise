
import java.util.Scanner;
public class roll_dice {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int dice_no;
    

    do{
      System.out.println("The entred number must be between 1 - 6");
      System.out.println("Enter the no. which appear after rolling: ");
      dice_no = sc.nextInt();

    }while(dice_no != 6);
    System.out.println(dice_no);
    System.out.println("Congratulation! Finally you get 6");
    sc.close();
  }

  
}
