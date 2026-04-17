import java.util.Scanner;

import message.hello.Person;

public class Program {

    public static void main(String[] args) {
        Person person = new Person(12, "Cghi");
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        person.setName(name);
        person.greet();
    }
}