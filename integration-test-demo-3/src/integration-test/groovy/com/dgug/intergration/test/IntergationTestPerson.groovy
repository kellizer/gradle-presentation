package com.dgug.intergration.test

import com.dgug.main.Person
import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: kellizer
 * Date: 08/06/2013
 * Time: 13:25
 * Sample Specification from spock (The best testing tool ever)..
 */
class IntergationTestPerson extends Specification {

    //super test.
    def "Test if the person can handle People who are older"() {
        setup:
        Person person = new Person(30);
        Person person2 = new Person(42);
        expect:
        !person.amIOlderThanYou(person2);
    }

    //super test.
    def "Test if the person can handle People who are younger"() {
        setup:
        Person person = new Person(30);
        Person person2 = new Person(21);
        expect:
        person.amIOlderThanYou(person2);
    }
}
