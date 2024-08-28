import java.util.Scanner;

public class Controlflow {
     public static void main(String[] args) {
       Scanner sr=new Scanner(System.in);
       System.out.print("Enter the number:");
       int num=sr.nextInt();
       int temp=num;
       System.out.println("Given number is Positive or Negative or Zero");
       if(num>0){
           System.out.println("Positive");
       }
       else if(num<0){
           System.out.println("Negative");
       }
       else{
           System.out.println("Zero");
       }
       System.out.println();
       System.out.print("do While loop:");
       do{
           System.out.print(temp+" ");
           temp--;
       }while(temp>0);
       System.out.println();
       System.out.println("Switch Case: To print the day based on number");
       switch(num){
           case 1:
               System.out.println("Sunday");
               break;
            case 2:
               System.out.println("Monday");
               break;
            case 3:
               System.out.println("Tuesday");
               break;
            case 4:
               System.out.println("Wednesday");
               break;
            case 5:
               System.out.println("Thursday");
               break;
            case 6:
               System.out.println("Friday");
               break;
            case 7:
               System.out.println("Saturday");
               break;
            default:
                System.out.println("Enter the valid input or not found");
       }
       System.out.println();
       System.out.print("for loop:");
       for(int i=1;i<=num;i++){
           System.out.print(i+" ");
       }
       System.out.println();
       System.out.print("While loop:");
       while(num>0){
           System.out.print(num+" ");
           num--;
       }
    }
}

