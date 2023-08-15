package evolenta.task;

import evolenta.task.models.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя");
            String name = in.nextLine();
            System.out.println("Введите возраст");
            int age = in.nextInt();
            users.add(new User(name, age));
        }
        Collections.sort(users);
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}