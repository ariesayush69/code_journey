class lec24{
    int result;
    int calculate(int n1,int n2){
        int cal=n1+n2;
        return cal;

    }
    public static void main(String[] args) {
        lec24 ob= new lec24();
       int r1= ob.calculate(9,7);
       System.out.println(r1);
    }
}