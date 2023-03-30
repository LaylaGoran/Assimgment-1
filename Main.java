//1-import the scanner class
import java.util.Scanner;
//2- create a class
class Main {
  public static void main(String[] args) 
  {
    //3- Constructor for objects of class Students
       Scanner in = new Scanner(System.in);
       System.out.println("please give me your name ?");
       String student_name = in.nextLine(); // read string from the user who input it 
        System.out.println("please enter your id students");
        int id= in.nextInt(); //read the termanal 
         System.out.println("Welcome " + student_name);
        int n1 = id % 10; 
        int n2 = (id/1000 % 10)+(id/10000 % 10);// fourth number is is 1000 and 5the 100000
        int n3 =(id/100 % 10);
        int n4 = (id/10 %10)*4 ;
        int n5 = n4 % 10;
        int n6 =n2%10;
        System.out.println("your passward is :"+n5+n3+n6+n1 );
        
         
  }
}