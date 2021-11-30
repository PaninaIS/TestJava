package primer;

public class Cat extends Animals implements Makingsounds{

    private Human human;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (name != other.name)
            return false;
        if (age != other.age)
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Cat{"
                + "Имя='" + name + '\''
                + ", возраст=" + age
                + '}';
    }

    public Cat(String name, int age) {
        super(name,age);
    }

    private Cat() {
    }


    @Override
    public void sounds() {
        System.out.println("Кошка мяукает");
    }

    //кто управляет котом
    public Human getHuman() {
        return human;
    }

    // Можно установить кота  для чел
    public void setHuman(Human human) {
        this.human = human;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Бегемот", 5);
        System.out.println("Кот " + cat1.getName() + " возраст:" + cat1.getAge());
        Cat cat2 = new Cat();
        System.out.println(cat2.getName());
        Cat nemo1 = new Cat("Nemo", 1);
        Cat nemo = new Cat("Nemo", 1);
        System.out.println(nemo == nemo1);//сравнение ссылок
        System.out.println(nemo.equals(nemo1));// метод сравнения объектов

        System.out.println("Изначальное имя кота — " + nemo.getName());
        nemo.setName("Василий");
        System.out.println("Новое имя кота — " + nemo.getName());

        nemo1.sounds();
        System.out.println(nemo1.hashCode());
    }
}