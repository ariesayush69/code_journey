class enhanced_for_loop{
    String name;
        int rollno;
        int hehe;
    public static void main(String[] args) {
        
        enhanced_for_loop s1=new enhanced_for_loop();
        s1.name = "kabir";
        s1.rollno = 19 ;
        s1.hehe = 5 ;

         enhanced_for_loop s2=new enhanced_for_loop();
        s2.name = "mohit";
        s2.rollno = 119;
        s2.hehe = 5;

         enhanced_for_loop s3 =new enhanced_for_loop();
        s3.name = "sandy";
        s3.rollno = 9;
        s3.hehe = 5;

         enhanced_for_loop students[] =new  enhanced_for_loop[3];
         students[0]=s1;
         students[1]=s2;
         students[2]=s3;
        for( enhanced_for_loop stud: students)
        {
        System.out.println(stud.name+":"+stud.rollno);
        }


    }
}