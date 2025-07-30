import java.util.Scanner;

public class Today30072025 {
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

    public static void Print(String str){
        System.out.println(str);
    }

    public static int fizzbuzz(int x){
        if((x%3==0) && (x%5==0)){
            return 1;
        }else if(x%3==0){
            return 2;
        }else if(x%5==0){
            return 3;
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        String greeting =new String("Hello, User");
        Scanner scanner = new Scanner(System.in);
        Print(greeting);
        Print("Enter a day: ");
        String day = scanner.next();
        switch (day){
            case "Monday"->
                Print("Monday, I wake at 06:00 A.M");
            case "Tuesday"->
                Print("Tuesday, I wake at 06:00 A.M");
            case "Saturday"->
                Print("Saturday, I wake at 10:00 A.M");
            case "Sunday"->
                Print("Sunday, I wake at 10:00 A.M");
            default->
                Print("I wake at 06:00 A.M");
        }
        if(fizzbuzz(5)==3) System.out.println("Buzz");
        if(fizzbuzz(3)==2) System.out.println("Fizz");
        if (fizzbuzz(15)==1) System.out.println("FizzBuzz");
        Design(32);
    }
}