package evolenta.task.models;

public class User implements Comparable<User> {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }

    @Override
    public int compareTo(User o) {
        return name.compareTo(o.getName());
    }
}
