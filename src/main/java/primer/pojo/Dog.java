package primer.pojo;

import primer.interfaces.AnimalMakingSounds;

public class Dog extends Animals implements AnimalMakingSounds {

    @Override
    public String toString() {
        return "Dog{"
                + "Имя='" + getName() + '\''
                + ", возраст=" + getAge()
                + '}';
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
