public class Logger
{
    public static Logger singleInstance=null;
    private Logger()
    {
        System.out.println("Updated");
    }
    public static Logger getInstance()
    {
        if(singleInstance==null)
        {
            singleInstance=new Logger();
        }
        return singleInstance;
    }
    public void log(String name)
    {
        System.out.println("Name: "+name);

    }
}