package com.mustafa.cat;

public class Boy extends Person {
private boolean HadMoloteryService;
    public Boy(String name, String Email, boolean hadMoloteryService) {
        super(name,Email);
        HadMoloteryService = hadMoloteryService;

    }


    @Override
    public void eat() {
    super.eat();
    System.out.println("as a boy");
}
}
