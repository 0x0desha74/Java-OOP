package com.mustafa.cat;

public class Person {



    private String name;

    public Person() {
        System.out.println("Hey from Parent");
    }

    private int Age;
   private String Email;
   private String Phone;
   private String Address;
   private int Grade;
   private int Height;

    public Person(String email, String name) {
        Email = email;
        this.name = name;
    }

    public void eat(){
        System.out.println("I'm Eating.");
    }
}

