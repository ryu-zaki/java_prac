package message;

public class hello {

    public static class Person { 
        private int age;
        private String name;

        public Person (int age, String name) {
          this.age = age; 
          this.name = name;
        }

        public void greet() {
            System.out.println("My name is " + name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
           this.name = name;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World...");
 
        Person myDog = new Person(12,"Chicki");
        myDog.name = "Jhonwell";
        myDog.greet();

    }
}