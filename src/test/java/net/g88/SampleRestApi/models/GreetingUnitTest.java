package net.g88.SampleRestApi.models;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author rpilachowski
 */
@Test(groups = {"unit"})
public class GreetingUnitTest {

    public void testGreetingDefault() {
        Greeting greeting = new Greeting();

        assertEquals(greeting.getWho(), "World", "Expected who to be 'World' for default constructor");
    }

    @DataProvider(name = "positiveGreetingData")
    public Object[][] positiveGreetingData() {
        return new Object[][] {
                {"Who is 'on first'", "on first"},
                {"Empty nameSpeeling ", ""}
        };
    }

    @Test(dataProvider = "positiveGreetingData")
    public void testGreeting(String msg, String who) {
        Greeting greeting = new Greeting(who);

        assertEquals(greeting.getWho(), who, "Unexpected value for 'who'");
    }
}
