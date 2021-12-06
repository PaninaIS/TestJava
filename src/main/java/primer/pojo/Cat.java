package primer.pojo;

import primer.interfaces.AnimalMakingSounds;
import primer.interfaces.impl.Animals;

public class Cat extends Animals implements AnimalMakingSounds {

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

    public Cat() {
    }


    @Override
    public void sounds() {
        System.out.println("Кот мяукает");
    }

    //кто управляет котом
    public Human getHuman() {
        return human;
    }

    // Можно установить кота  для чел
    public void setHuman(Human human) {
        this.human = human;
    }


}