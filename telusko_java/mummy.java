import java.util.*;

class bank {
    String holdername;
    int accountnumber;
    int balance,flag=1;
    int rem;

    void input() 
    {
        System.out.println(holdername);
        System.out.println(accountnumber);
        System.out.println(balance);
    }
    boolean deposit()
    {
        if (flag == 1) 
        {
            System.out.println("deposited");
            return true;
        } 
        else
         {
            System.out.println("not deposited ");
            return false;
        }
    }

    void withdraw(int sx) {
        
        System.out.println("amount withdrawn : " + sx);
        rem=sx;
    }
    void displaybalance()
    {
        int remaining;
        remaining= balance - rem;
        System.out.println("remaining"+remaining);
    }
}
public class mummy
{
    public static void main(String[] args)
     {
        Scanner kb = new Scanner(System.in);

        bank ob = new bank();
        bank obj=new bank();

    System.out.print("holdername: ");
        ob.holdername = kb.nextLine();
    obj.holdername = kb.nextLine();
        System.out.print("accountnumber: ");
        ob.accountnumber = kb.nextInt();

    obj.accountnumber = kb.nextInt();

        System.out.print("balance: ");
        ob.balance = kb.nextInt();

    obj.balance = kb.nextInt();

        ob.input();
        obj.input();
        ob.deposit();

        System.out.print("withdrawn amount: ");
        int sx = kb.nextInt();
        ob.withdraw(sx);
     ob.displaybalance();
     obj.displaybalance();
     
     }
}