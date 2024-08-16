import java.util.Scanner;

public class IT24100881Lab4Q2{

public static void main(String[] args){

Scanner input=new Scanner(System.in);

System.out.println("pls enter the exam marks out of 100:");
int examMarks=input.nextInt();

if(examMarks<0||100<examMarks){
System.out.println("Invalid input for exam marks, please terminate the program");
return;
}

System.out.println("pls enter the lab submission marks out of 100:");
int labMark=input.nextInt();

if(labMark<0||100<labMark){
System.out.println("Invalid input for lab submission marks,please terminate the program");
return;
}

System.out.println("Pls enter the exam percentage:");
int examPercentage=input.nextInt();

if(examPercentage<0||100<examPercentage){
System.out.println("Invalid exam percentage!.pls terminate the program.");
return;
}

System.out.println("pls enter the lab submission percentage:");
int labSubmissionPercentage=input.nextInt();

if(labSubmissionPercentage>100||labSubmissionPercentage<0){
System.out.println("Invalid lab submission percentage,please terminate the program");
return;
}

if(labSubmissionPercentage+examPercentage != 100){
System.out.println("Invalid percentage mark! Terminate the program.");
return;
}

double finalMark=(examMarks*examPercentage/100.0)+(labMark*labSubmissionPercentage/100.0);

System.out.println("Final mark is"+finalMark);
   }
}

