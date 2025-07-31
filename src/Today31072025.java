public class Today31072025 {

    public static void Print(String s){
        System.out.println(s);
    }


    public static void Print(int s){
        System.out.println(s);
    }

    public static void main(String[] args){
        for(int i=0;i<=10;i++){
            if(i==5)
                continue;
            Print(i);
        }
    }

}