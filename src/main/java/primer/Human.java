package primer;

public class Human {
    String name;
    int age;
    String gender;
    private Cat cat;

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

    public void setName(Human human) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(Human human) {
        this.age = age;
    }


    public static void main(String[] args) {
        Human human1 = new Human("Виталий", 35, "мужской");
        System.out.println(human1.getName());
        Human human2 = new Human("Наталья", 28, "женский");
        System.out.println(human2.getName());
        //Human vitali=new Human(Cat.cat1)
        //human1.setCat(Cat.cat1);
        //System.out.println(human1.getName() +"  имеет кота "+ cat1.name());
        //System.out.println(human2.getName() +"  имеет кота "+ cat2.name());
    }
}
