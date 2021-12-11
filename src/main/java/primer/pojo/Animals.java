package primer.pojo;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
    this.name=name;
    this.age=age;
    }
    public Animals() {
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 & age < 25) {
            this.age = age;
        } else {
            System.out.println("Ошибка!");
        }
    }

}
