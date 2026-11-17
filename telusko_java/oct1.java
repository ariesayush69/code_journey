
import java.math.BigDecimal;

class oct1
{
    public static void main(String[] args) 
    {
        float f =24.15f;
        double d =24.17;
        BigDecimal b1 = new BigDecimal(23.34354656576767);
         BigDecimal b2 = new BigDecimal(3.34354656767);
         System.out.println(b1.add(b2));
         System.out.println(b1.subtract(b2));
         BigDecimal b3 =b1.multiply(b2);
         System.out.printf("%.1f",b3);
         System.out.println(b1.remainder(b2));
         System.out.println(b1.compareTo(b2));
    }
}