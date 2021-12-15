package primer.pojo;

public class Human {
    private String name;
    private int age;
    private String gender;
    private Cat cat;
    private Dog dog;


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
    //узнать каким котом владеет котом
    public Cat getCat(){
           return cat;
    }

    //человеку присвоить кота
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog(){
        return dog;
    }

     public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Human{"
                + "Имя='" + name + '\''
                + ", возраст=" + age
                + ", пол=" + gender
                + '}';
    }
}
