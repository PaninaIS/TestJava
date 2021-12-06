package primer.pojo;

import primer.interfaces.AnimalMakingSounds;
import primer.interfaces.impl.Animals;
import primer.pojo.Cat;

public class Dog extends Animals implements AnimalMakingSounds {
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
}
