/*
class sept30
{
    public static void main(String[] args) {
        System.out.println(45);
         System.out.println(045);
          System.out.println(0x45);
           System.out.println(0b101101);
    }
}
*/



import java.math.BigInteger;
class sept30
{
    public static void main(String[] args) {
         BigInteger b1=new BigInteger("1234567890123456789012345567890");
         BigInteger b2= new BigInteger("098978676756453423109897867");
         int k=5;
         System.out.println(b1.add(b2));
         System.out.println(b1.subtract(b2));
         System.out.println(b1.multiply(b2));
         System.out.println(b1.divide(b2));
         System.out.println(b1.remainder(b2));
         System.out.println(b1.pow(23));
         System.out.println(b1.compareTo(b2));
        System.out.println(b1.pow(k));
        System.out.println(b1.pow(7));
        System.out.println(b2.compareTo(b1));
        System.out.println(0.1+0.2);
        System.out.println(0.1+0.2==0.3);
    }
}




