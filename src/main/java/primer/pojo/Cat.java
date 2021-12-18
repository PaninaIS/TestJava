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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (getName() != other.getName())
            return false;
        if (getAge() != other.getAge())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = getName() == null ? 0 : getName().hashCode();
        result = result + getAge();
        return result;
    }
   }