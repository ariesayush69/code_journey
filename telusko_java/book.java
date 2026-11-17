import java.util.*;
class library
{
    int books;
    String study_desk;

}
boolean studybooks( int book)
{
    int boom=book;
    if(boom==1)
    {
    System.out.println("want to study");
     return true;
    else
    {
        System.out.println("dont want to study");
        return false;
    }

}}

public class book
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        library ob = new library();
        System.out.println("do you want to study books");
        ob.books=kb.nextInt();

    }
}