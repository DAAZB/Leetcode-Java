package my;

public class ExceptionTest {
    public void test1()
    {
        try
        {
            int a = 3 / 0;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    public void test2()
    {
        try
        {
        int[] a = new int[3];
        a[3] = 10;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }


    public void test3()
    {
        try
        {
        String s = null;
        System.out.println(s.length());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }


    public void checkNumber(int num) throws Exception
    {
        if(num<0)
        {
            throw new Exception("error");
        }
    }
    
}
