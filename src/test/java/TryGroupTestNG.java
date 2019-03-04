import org.testng.annotations.Test;

public class TryGroupTestNG
{
    @Test(groups = {"smoke"})
    public void SmokeTest()
    {
        System.out.println("I am a smoke test!");
    }

    @Test(groups = {"regression"})
    public void RegressionTest()
    {
        System.out.println("I am a regression test!");
    }

    @Test(groups = {"regression", "smoke"})
    public void MultiTest()
    {
        System.out.println("I am a regression and a smoke test!");
    }
}
