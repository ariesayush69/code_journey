import java.util.*;
class student
{
    String name;
    int grades1,grades2,roll_no;
    int batch;
     void displaydetails()
     {
    System.out.println("student name"+name);
    System.out.println(" grades"+ grades1);
     System.out.println(" grades"+ grades2);
    System.out.println(" roll.no"+roll_no);
    System.out.println(" batch"+batch);
     }
     void calculategrades()
     {
        System.out.println("totalgrades"+ (grades1+grades2));
     }
}
public class main1
{
   public static void main(String[] args) 
   {
    Scanner kb=new Scanner(System.in);
     student ob= new student();
     student obj=new student();

     ob.name=kb.nextLine();
     ob.grades1=kb.nextInt();
     ob.grades2=kb.nextInt();
     ob.roll_no=kb.nextInt();
     ob.batch=kb.nextInt();
    
   
   obj.name=kb.nextLine();
   obj.grades1=kb.nextInt();
   obj.grades2=kb.nextInt();
   obj.roll_no=kb.nextInt();
   obj.batch=kb.nextInt();

     ob.displaydetails();
     ob.calculategrades();
   obj.displaydetails();
   obj.calculategrades();

   }
}
