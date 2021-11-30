package primer;

public class Dog extends Animals implements Makingsounds {
    @Override
    public String toString() {
        return "Dog{"
                + "Имя='" + name + '\''
                + ", возраст=" + age
                + '}';
    }
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
    public Dog(String name, int age) {
        super(name,age);
    }

    private Dog() {
    }

     @Override
    public void sounds() {
        System.out.println("Собака лает");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Рекс", 7);
        System.out.println(dog1.getName());
        Dog dog2 = new Dog("Мухтар", 3);
        System.out.println(dog2.getName());
        dog1.sounds();
        System.out.println(dog1.hashCode());
    }
}
