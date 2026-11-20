class new1
{   
    public static void main(String[] args) {
         int r1,r2,r3,r4;
        me obj = new me();
       r1 = obj.function1(5,4);
       r2 = obj.function2();
       obj.function3(5);
       obj.function4();
       System.out.println(r1+" "+r2);

        
    }
}
class me
{
    int function1(int n1,int n2)
    { 
        return n1*n2;
    }
    int function2()
    {
        int n=5;
        return n*n;
    }
    void function3(int n1)
    {
        int sq=n1*n1;
      System.out.println(sq);
    }
    void function4()
    {
        int n1 =5;
        System.out.println(n1);

    }
    /* 
    int function4()   // java does not recognise methods by their return type so void function4() && int function4() are same for java
    {
        return 3+2;
    }
    */
}