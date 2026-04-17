package message;

public class hello {
    static int x  = 0;
    
    public static class Person { 
        private int age;
        private String name;
        
        double num = 0;
        int num2 = (int) num;

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

           String[] arr = { "sccsc", "scsc", "scsc" };

          for (String item: arr) {
            
          }
        }

        public void setName(int age) {

        }
    }

    public static int sum(int num) {
     
        if (num > 0) {
            return num + sum(num - 1);
        } else {
            return num;
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello World...");
 
        Person myDog = new Person(12,"Chicki");
        myDog.name = "Jhonwell";
        myDog.greet();

        System.out.println(x);

    }
}