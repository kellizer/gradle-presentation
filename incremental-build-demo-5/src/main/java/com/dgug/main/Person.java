package com.dgug.main;

/**
 * This is a change to the comments..
 * A person who has knowledge of age.
 */
public class Person {

    private int myAge;

    public Person(int myAge) {
        this.myAge = myAge;
    }

    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println("Saying Hello From Person Main.");
        else {
            System.out.println("Hello " + args[0] + ", nice to meet you.");
        }

    }

    /**
     * Give you my age.
     *
     * @return - my age.
     */
    public int getMyAge() {
        return myAge;
    }

    /**
     * I'll tell you if you are older than me.
     *
     * @param yourAge - what age you age
     * @return true if you are older, false if you are younger of the same age.
     */
    public boolean amIOlderThanYou(Person yourAge) {

        return myAge > yourAge.getMyAge();

    }

}
