package service;

import model.Director;
import model.Human;

import java.util.Scanner;

public class DirectorService extends HumanService{

public Director createDirector(){
    Human human = create();
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter pechat");
    String p = scanner.next();



    return new Director(human.getFullName(), human.getAge(), human.getGender(), p);


}

}
