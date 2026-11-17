class number1
{
    public static void main(String[] args) {
        int i=2,j,c=0;
       /* for(i=1;i<=50;i++)  - for loop for number divisible by 7
        {
            if(i%7==0)
            {
                System.out.println("divisible by 7:  "+i);*/

               /* while(i<=50) //while loop for number divisible by 7
                {
                    if(i%7==0)
                    System.out.println("divisible by 7:  "+i);
                    i++;*/
                
                 /* do { //do while loop
                     if(i%7==0)
                      System.out.println("divisible by 7:  "+i);
                      i++;
                  } while (i<=50);*/

                /*  for(i=1;i<=50;i++) // - for loop for number divisible by 2
        {
            if(i%2==0)
            {
                System.out.println("divisible by 2:  "+i);
            }
        }*/

       /*while(i<=50) //while loop for number divisible by 2
                {
                    if(i%2==0)
                    System.out.println("divisible by 2:  "+i);
                    i++;
                }
                */
               for(;i<=100;i++)
               {
                for(j=1;j<=i;j++)
                {
                    if(i%j==0)
                    c++;
                }
                   if(c==2)
                    System.out.println("prime number : "+i);
                    c=0;
               }
    }
}
    
