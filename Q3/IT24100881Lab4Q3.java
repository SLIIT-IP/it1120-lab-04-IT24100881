import java.util.Scanner;

public class IT24100881Lab4Q3{
	public static void main(String[] args) {
Scanner input=new Scanner(System.in);

	System.out.println("Enter a number: ");
      int number=input.nextInt();


  String result=(number>0)?"The number is positive.":
                (number<0)?"The number is negative.":
                 "The number is Zero";
System.out.println(result);

  }
}
