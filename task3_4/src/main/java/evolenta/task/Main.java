package evolenta.task;

import evolenta.task.models.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner in = new Scanner(System.in);
        String name1 = in.nextLine();
        System.out.println("Введите возраст");
        int age1 = in.nextInt();
        User user1 = new User(name1,age1);
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите имя");
        String name2 = in2.nextLine();
        System.out.println("Введите возраст");
        int age2 = in2.nextInt();
        User user2 = new User(name2,age2);
        if (user1.getAge()<user2.getAge()) System.out.println(user1.toString());
        else System.out.println(user2.toString());

    }
}