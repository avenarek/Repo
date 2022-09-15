package service;

import model.Human;
import model.Worker;

import java.util.Scanner;

public class WorkerService extends HumanService {

    public Worker createWorker() {
        Human human = create();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter uniform");
        boolean uniForm = scanner.nextBoolean();

        return new Worker(human.getFullName(), human.getAge(), human.getGender(), uniForm);


    }
}

// avelacnel uniofgormy u nuyny directori hamar,
//u logika grenq