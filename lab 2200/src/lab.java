import java.util.Scanner;

public class lab{

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);


        vehicle v=new vehicle();
        void dosomething(vehicle...v)
     {
         int sp=sc.nextInt();
         char o=sc.nexrInt();
           if(o=='c')
           {
               car c=new car ();
               Boolean a;
               a=(c instanceof v);
               if(a==true)
               {
                   int sp= sc.nextInt();

                   c.speed(sp);
                   System.out.println(sp);
                   c.isrunning();
               }
           }
           if(o=='p')
           {

               plane p=new plane ();
               Boolean a;
               a=(p instanceof v);
               if(a==true)
               {
                   int sp= sc.nextInt();

                   p.speed(sp);
                   System.out.println(sp);
                   p.isrunning();
               }
           }
           if(o=='b') {
               boat  b = new boat();
               Boolean a;
               a = (c instanceof v);
               if (a == true) {
                   int sp = sc.nextInt();

                   b.speed(sp);
                   System.out.println(sp);
                   b.isrunning();
               }
           }
           if(o=='h')
           {
               helicupter h = new helicupter();
               Boolean a;
               a = ( h instanceof v);
               if (a == true) {
                   int sp = sc.nextInt();

                   h.speed(sp);
                   System.out.println(sp);
                   h.isrunning();
               }
           }



    }

}

}
