package primer.pojo;

import primer.interfaces.AnimalMakingSounds;

public class Dog extends Animals implements AnimalMakingSounds {

   private Human human;

    public Dog(String name, int age) {
        super(name,age);
    }

    private Dog() {
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman (Human human) {
        this.human = human;
    }

        public String toString() {
        return "Dog{"
                + "Имя='" + super.getName() + '\''
                + ", возраст=" + super.getAge()
                + '}';
    }

     @Override
    public void sounds() {
        System.out.println("Собака лает");
    }
}
