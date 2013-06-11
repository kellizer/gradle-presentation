package com.dgug.unit;

import com.dgug.main.Person;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: kellizer
 * Date: 08/06/2013
 * Time: 13:25
 * Sample Unit Test
 */
public class UnitTestPerson {

    /**
     * Tests if The persons handles people who are older
     */
    @Test
    public void testPersonAgeWhenOlder() {
        assertFalse(new Person(30).amIOlderThanYou(new Person(40)));
        assertFalse(new Person(40).amIOlderThanYou(new Person(50)));
    }

    /**
     * Tests if The persons calculates who is younger correctly
     */
    @Test
    public void testPersonAgeWhenYounger() {
        assertTrue(new Person(30).amIOlderThanYou(new Person(20)));
        assertTrue(new Person(40).amIOlderThanYou(new Person(30)));
    }

    /**
     * Tests if The person calculates who is the same age correctly.
     */
    @Test
    public void testPersonAgeWhenSameAge() {
        assertFalse(new Person(30).amIOlderThanYou(new Person(30)));
        assertFalse(new Person(40).amIOlderThanYou(new Person(40)));
    }

}
