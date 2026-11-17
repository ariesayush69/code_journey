class labelled_break
{
    public static void main(String[] args) {
        int row,col;
        /*search:
        for (row=1;row<=3;row++)
        {
           for (col=1;col<=3;col++) 
           {
            if(row==2 && col==2)
            break search;
            
           }
           System.out.println(row+" , "+col);
        }
        System.out.println("search ended");*/
         
         search:
        for (row=1;row<=3;row++)
        {
           for (col=1;col<=3;col++) 
           {
            if(row==2 && col==2)     
            continue search;
            
           }
           System.out.println(row+" , "+col);
        }
        System.out.println("search ended");
    }
}