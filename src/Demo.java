import java.util.Scanner;

public class Demo {
    public static void Design(int x){
        /*Program to print design.*/
        for(int i=0;i<=x;i++){
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Program made by Debaditya Malakar");
        for(int i=0;i<=x;i++){
            System.out.print("=");
        }
    }

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

//        int a;
//        System.out.println("Enter a number: ");
//        a=scanner.nextInt();
//        if(a%3==0 && a%5==0){
//            System.out.println("Divisible by both 3 and 5");
//        }
//        else if(a%3==0){
//            System.out.println("Divisible by 3");
//        } else if(a%5==0){
//            System.out.println("Divisible by 5");
//        } else {
//            int sub=a%3;
//            System.out.println("Not Divisible by 3");
//            System.out.println(sub);
//        }
//        int floor;
//        System.out.println("Enter floor you want to go to: ");
//        floor=scanner.nextInt();
//        if(floor==1 || floor == 3 || floor == 5){
//            System.out.println("Assigned Lift is Lift A");
//        }else if(floor==2 || floor == 4){
//            System.out.println("Assigned Lift is Lift B");
//        }else if(floor==6 || floor==7){
//            System.out.println("Assigned Lift is Lift C");
//        }else{
//            System.out.println("Error: Invalid floor Entered");
//            System.out.println("Lift not assigned due to Error.");
//        }
        int timeTaken;
        System.out.println("Enter Time Taken in Hours: ");
        timeTaken=scanner.nextInt();
        if(timeTaken>=1 && timeTaken <= 4){
            System.out.println("Choice of transportation: car");
        } else if (timeTaken>=5 && timeTaken <= 7) {
            System.out.println("Choice of transportation: bike");
        } else if (timeTaken >= 8 && timeTaken <= 10) {
            System.out.println("Choice of transportation: bus");
        } else if (timeTaken <=0) {
            System.out.println("Distance covered cannot be negative");
        } else {
            System.out.println("Choice of Transport: Walk");
        }
        Design(32);
    }
}