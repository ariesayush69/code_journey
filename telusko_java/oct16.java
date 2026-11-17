import java.util.*;
class oct16
{
    public static void main(String[] args) {
        int r1_strt,r1_end,r2_strt,r2_end;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter you bill");
        /*units=kb.nextInt();
        if(units>0 && units<=100)
          System.out.println(units*3);
        else if(units>100 && units<=200)
            System.out.println(100*3+(units-100)*5);
        else
         System.out.println(100*3+100*5+(units-200)*8);*/
         
         System.out.println("enter range 1");
         r1_strt=kb.nextInt();
         r1_end=kb.nextInt();
         System.out.println("enter range 2");
         r2_strt=kb.nextInt();
         r2_end=kb.nextInt();
         if(r1_strt<r2_strt && r1_end>r2_end)
         System.out.println("complete overlap");
         else if(r1_strt>r2_strt && r1_end<r2_end)
         System.out.println("complete overlap");
         else if (r1_strt>r2_strt || r1_end<r2_end)
         System.out.println("partial overlap");
         else if (r1_strt==r2_strt && r1_end==r2_end)
         System.out.println("complete overlap");
         else
         System.out.println("no overlap ");

    }
}