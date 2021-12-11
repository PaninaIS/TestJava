package primer.pojo;

import primer.interfaces.AnimalMakingSounds;

public class Cat extends Animals implements AnimalMakingSounds {

     @Override
    public String toString() {
        return "Cat{"
                + "Имя='" + getName() + '\''
                + ", возраст=" + getAge()
                + '}';
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
        System.out.println("В клинику попал уличный кот!");
    }

    @Override
    public void sounds() {
        System.out.println("Кот мяукает");
    }

   }