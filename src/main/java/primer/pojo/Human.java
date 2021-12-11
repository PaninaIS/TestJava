package primer.pojo;

public class Human {
    private String name;
    private int age;
    private String gender;


    @Override
    public String toString() {
        return "Human{"
                + "Имя='" + name + '\''
                + ", возраст=" + age
                + ", пол=" + gender
                + '}';
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    private Human() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age >= 0 ) {
            this.age = age;
        } else {
            System.out.println("Ошибка!");
        }
    }

}
