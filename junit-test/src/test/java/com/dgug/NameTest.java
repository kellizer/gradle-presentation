package com.dgug;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: kellizer
 * Date: 20/05/2013
 * Time: 21:47
 * A simple name test that checks the name for a class.
 */
public class NameTest {

    @Test
    public void name_of_class_should_be_called_al() {
        Assert.assertEquals("Call me Al", new Al().toString());
    }

    //    @Test
    @Ignore("Comment this out and uncomment the test annotation to see this test fail")
    public void name_of_class_should_be_called_ed() {
        Assert.assertEquals("Call me Ed", new Al().toString());
    }


}
