package service;

import model.Human;
import model.Worker;

import java.util.Scanner;

public class HumanService {
    public Human create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Full_Name");
        String fullName = scanner.next();
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println("Enter the gender");
        char gender = scanner.next().charAt(0);

        return new Human(fullName, age, gender);
    }
}
