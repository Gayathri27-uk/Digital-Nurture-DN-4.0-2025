import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Logger l1=Logger.getInstance();
        l1.log("Gayathri");
        Logger l2=Logger.getInstance();
        l2.log("Bhava");
        if(l1==l2)
        {
            System.out.println("Same instance is used");
        }
        else{
            System.out.println("Different instance is used");
        }
    }
    
}
