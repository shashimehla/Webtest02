package nz.co.webtest;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by E6500 on 30/06/2017.
 */
public class CityTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testGetCapitalCityOf() throws Exception {

        String val1 = "New Zealand";
        City test = new City();

        String result1 = test.getCapitalCityOf(val1);
        Assert.assertEquals("Wellington", result1);

    }

}