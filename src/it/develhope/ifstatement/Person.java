package it.develhope.ifstatement;

import java.util.Random;

public class Person {

    public int age;

    public Person() {
        double randomValue = Math.floor(Math.random() * (80 - 5 + 1) + 5);
        this.age = (int) randomValue;
    }

    public String getLifeStage() {
        if (age <= 12) {
            return "Child";

        } else if (age >= 13 && age <= 19) {
           return "Teen";

        } else if (age >= 20 && age <= 59) {
            return "Adult";

        } else if (age > 60) {
            return "Senior adult";

        } else { return "Cannot determine the life stage";

        }
    }
}
