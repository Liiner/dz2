import java.util.Scanner;

public class dz2 {

    public static void main(String[] args) {
        function1();
        function2();
        function3();
        function4();
        function5();
    }
    public static void function1(){
       int a = 5;
       int b = 120;
        if ( a + b >= 10 && 20 >= a + b){
          System.out.println("true");}
          if (a + b <10 || a + b > 20 ){
              System.out.println("false");
          }
        }
    public static void function2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number = ");
        int number = sc.nextInt();
               if (number >=0 ) {
            System.out.println("positive");
        }
        if (number <0){
            System.out.println("negative");
        }
    }
    public static void function3(){
        int a = 5;
        if (a >=0) {
            System.out.println("False");
        }
            if (a < 0){
                System.out.println("True");
            }
    }
    public static void function4(){
        String text = "I_LOVE_JAVA";
       for(int i = 0; i < 5; i++){
           System.out.println("" + text);
       }
    }
    public static void function5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write age  =");
        int age = sc.nextInt();
        sc.close();
        if (age % 4 > 0 || age % 100 == 0 && age % 400 !=0 ){
          System.out.println(false);
        }
        if  ( age % 4 == 0 && age % 100 != 0 || age % 400 == 0) {
            System.out.println(true);
        }
    }
}



