package SetUp;

public class CodeDelay
{
    public void waitForTestToLoad()
    {
        try
        {
            Thread.sleep(40000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
