import java.util.Scanner;

public class vehicle {
 Scanner sc=new Scanner(System.in);

    public  int s;
    public void speed(int sp)
    {
        int speed=sp;
         s=speed;
    }
    public void isrunning()
    {
        if(s==0)
            System.out.println("is not running");
            else
            System.out.println("is running");

    }

}

