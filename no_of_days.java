import java.util.*;
class no_of_days 
{
    public static void main(String[] args)
    {
    String m;
    int n;
    Scanner kb = new Scanner(System.in);
    m = kb.nextLine();
    switch(m){
        case "january","march","may","july","september","november":
            System.out.println("31");
            break;
             case "april","june","august","october","december":
            System.out.println("30");
            break;
            case "feb":
            System.out.println("28 or 29 - year btao phele");
            n = kb.nextInt();
            if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
            {
                System.out.println("leap year - 29");
            }
            else
            {
                System.out.println("non-leap year - 28");
            }
            break;
            default:
                System.out.println("ladle masti nhi shi shi daalo beta");
    }

    }
}