import java.util.ArrayList;
import java.util.Scanner;

import models.DogSex;

public class Program {

    public static class Organism {
        protected String breed = "Chuahua";
    }

     public static class Animal extends Organism {
        protected String breed = "Labrador";
    }

    public static ArrayList<Dog> animals = new ArrayList<Dog>();
    
    public static class Dog extends Animal {
        private String breed;
        private String name;
        private DogSex sex;

        public Dog(String name, DogSex sex) {
            this("Shitzu", name, sex);
        }

        public Dog(String breed, String name, DogSex sex) {
            this.breed = breed;
            this.name = name;
            this.sex = sex;
        }

         public void greet() {
            System.out.println("Hi I am " + name + " and I'm a " + breed);
        }

      /*   public void sayGender() {
            System.out.println("My gender is " + sex);
        } */

       
    }

    public static void main(String[] args) {
        
       Dog dog1 = new Dog("Labrador", "BaoBao", DogSex.MALE);
       Dog dog2 = new Dog("Luna", DogSex.FEMALE);
       animals.add(dog1);
       animals.add(dog2);
       Dog dog3 = new Dog("Labrador", "BaoBao", DogSex.MALE);
       System.out.println(animals.contains(dog3));


    }


}