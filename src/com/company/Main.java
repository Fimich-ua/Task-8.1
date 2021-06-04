package com.company;

class Dog {
    String name;

    public void giveAVoice() {
        System.out.print("WOOF WOOF \n");
    }

    public void giveYourPaw() {

        System.out.printf("Dog %s gave a paw \n", name);
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Jack");
        dog.giveAVoice();
        dog.giveYourPaw();

    }
}
