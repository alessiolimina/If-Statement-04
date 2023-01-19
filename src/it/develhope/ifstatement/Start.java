package it.develhope.ifstatement;

public class Start {
    public static void main(String[] args) {

        System.out.println("---------------Starting-------------");

        Person person = new Person();
        System.out.println("The person is " + person.age + " years old: the person is in the " + person.getLifeStage() + " stage of life");

        System.out.println("------------------------------------");

    }
}
