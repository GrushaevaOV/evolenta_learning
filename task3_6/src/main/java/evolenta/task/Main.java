package evolenta.task;


import evolenta.task.models.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, List<User>> listHashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя");
            String name = in.nextLine();
            System.out.println("Введите возраст");
            int age = in.nextInt();
            if (!listHashMap.containsKey(age)) {
                listHashMap.put(age, new ArrayList<>());
            }
            List<User> value = listHashMap.get(age);
            value.add(new User(name, age));
            Collections.sort(value);
        }
        System.out.println("Введите возраст, который вас интересует ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        searchAge(listHashMap, age);
    }

    public static void searchAge(HashMap<Integer, List<User>> listHashMap, int age) {
        boolean flag = false;
        for (Map.Entry<Integer, List<User>> entry : listHashMap.entrySet()) {
            if (entry.getKey() == age) {
                flag = true;
                for (User value : entry.getValue()) {
                    System.out.println(value);
                }
            }
        }
        if (!flag) System.out.println("Такого возраста в словаре нет");
    }
}