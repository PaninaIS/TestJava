package primer;

public class Connecting {
    public static void main(String[] args) {
        Human vitalii = new Human("Виталий", 35, "муж");

        Cat begemot = new Cat("Бегемот", 5);

        Dog reks = new Dog("Рекс", 7);


        System.out.println(vitalii.getName() +
                " имеет кота " + begemot.getName() + " и собаку " + reks.getName());

        Human natali = new Human("Наталья", 28, "женский");

        Cat nemo = new Cat("Nemo", 1);

        Dog muhtar = new Dog("Мухтар", 3);

        System.out.println(natali.getName() +
                " имеет кота " + nemo.getName() + " и собаку " + muhtar.getName());
    }
}
