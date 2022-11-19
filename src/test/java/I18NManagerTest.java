
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.dsa.I18Nmanager;
import java.util.MissingResourceException;

public class I18NManagerTest {

    I18Nmanager i18n;


    @Before
    public void setUp() throws Exception{
        this.i18n = I18Nmanager.getInstance();

    }

/**
    @After
    public void tearDown() {
        this.i18n.getInstance().clear();
    }*/

    @Test
    public void testGetText() throws Exception {
        String msg1 = I18Nmanager.getInstance().getText("ca","l1");
        Assert.assertEquals("hola", msg1);

        String msg2 = I18Nmanager.getInstance().getText("ca","l2");
        Assert.assertEquals("avion", msg2);

        String msg3 = I18Nmanager.getInstance().getText("ca","l3");
        Assert.assertEquals("puerta", msg3);

        /////

        String msg4 = I18Nmanager.getInstance().getText("en","l1");
        Assert.assertEquals("hello", msg4);

        String msg5 = I18Nmanager.getInstance().getText("en","l2");
        Assert.assertEquals("aircraft", msg5);

        String msg6 = I18Nmanager.getInstance().getText("en","l3");
        Assert.assertEquals("gate", msg6);

        ////

        String msg7 = I18Nmanager.getInstance().getText("fr","l1");
        Assert.assertEquals("bonjour", msg7);

        String msg8 = I18Nmanager.getInstance().getText("fr","l2");
        Assert.assertEquals("avion", msg8);

        String msg9 = I18Nmanager.getInstance().getText("fr","l3");
        Assert.assertEquals("portail", msg9);

        ////

        String msg10 = I18Nmanager.getInstance().getText("al","l1");
        Assert.assertEquals("hallo", msg10);

        String msg11 = I18Nmanager.getInstance().getText("al","l2");
        Assert.assertEquals("Flugzeug", msg11);

        String msg12 = I18Nmanager.getInstance().getText("al","l3");
        Assert.assertEquals("Tor", msg12);

    }


    @Test(expected = MissingResourceException.class)
    public void testGetTextBundleNotFound() throws Exception {

        String msg1 = I18Nmanager.getInstance().getText("al","l1");
        Assert.assertEquals("hallo", msg1);

        String msg2 = I18Nmanager.getInstance().getText("al","l2");
        Assert.assertEquals("Flugzeug", msg2);

        String msg3 = I18Nmanager.getInstance().getText("it","l1");
        Assert.assertEquals("ciao", msg3);
    }
}