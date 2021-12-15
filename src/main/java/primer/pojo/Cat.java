package primer.pojo;

import primer.interfaces.AnimalMakingSounds;

public class Cat extends Animals implements AnimalMakingSounds {
    private Human human;

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
        System.out.println("В клинику попал уличный кот!");
    }

    //узнать какой человек владеет котом
    public Human getHuman() {
        return human;
    }
    //присвоить человека для кота
    public void setHuman (Human human){
        this.human=human;
    }
    @Override
    public String toString() {
        return "Cat{"
                + "Имя='" + getName() + '\''
                + ", возраст=" + getAge()
                + '}';
    }
    @Override
    public void sounds() {
        System.out.println("Кот мяукает");
    }

   }