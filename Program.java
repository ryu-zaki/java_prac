import java.util.Scanner;

public class Program {

    public static class Organism {
        protected String breed = "Chuahua";
    }

     public static class Animal extends Organism {
        protected String breed = "Labrador";
    }
    
    public static class Dog extends Animal {
        private String breed;
        private String name;


        public Dog(String name) {
            this("Shitzu", name);
        }

        public Dog(String breed, String name) {
             
            this.name = name;
            this.breed = super.breed;
           
        }
        

         public void greet() {
            System.out.println("Hi I am " + name + " and I'm a " + breed);
        }
       
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Dog dog = new Dog("Tonio");
     
        dog.greet();

    }


}