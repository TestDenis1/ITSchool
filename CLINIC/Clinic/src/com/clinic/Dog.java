package com.clinic;

/**
 * Created by Денис on 26.01.2016.
 */
public class Dog implements Pet {

   private String name;


    public Dog(final String name) {
        this.name = name;
    }


    @Override
    public String getPetName() {
        return this.name;
    }

}
