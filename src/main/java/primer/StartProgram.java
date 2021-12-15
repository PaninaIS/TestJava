package primer;

import primer.pojo.Cat;
import primer.pojo.Dog;
import primer.pojo.Human;

public class StartProgram {
    public static void main(String[] args) {
        Human vitalii = new Human("Виталий", 35, "муж");

        Cat begemot = new Cat("Бегемот", 5);

        Dog reks = new Dog("Рекс", 7);

        System.out.println(vitalii.getName()+" "+vitalii.getAge()+"лет");
        System.out.println("Кот " + begemot.getName() + " возраст:" + begemot.getAge());
        System.out.println("Собака "+reks.getName()+" возраст: "+reks.getAge());

        vitalii.setCat(begemot);
        vitalii.setDog(reks);
        begemot.setHuman(vitalii);
        reks.setHuman(vitalii);

        System.out.println("У "+begemot.getHuman().getName() +
                " есть кот " + vitalii.getCat().getName() + " и собака " + vitalii.getDog().getName());

        Human natali = new Human("Наталья", 28, "женский");

        Cat nemo = new Cat("Nemo", 1);

        Dog muhtar = new Dog("Мухтар", 3);

        natali.setCat(nemo);
        natali.setDog(muhtar);
        nemo.setHuman(natali);
        muhtar.setHuman(natali);

        System.out.println(natali.getName()+" "+natali.getAge()+" лет");
        System.out.println("Кот " + nemo.getName() + " возраст: " + nemo.getAge());
        System.out.println("Собака "+muhtar.getName()+" возраст: "+muhtar.getAge());


        System.out.println("У "+nemo.getHuman().getName() +
                " есть кот " + natali.getCat().getName() + " и собака " + natali.getDog().getName());

        Cat catNotName1 = new Cat();
       // System.out.println("В клинику попал уличный кот "+catNotName1.getName());

        System.out.println("Изначальное имя человека — " + vitalii.getName());
        vitalii.setName("Ветал");
        System.out.println("Новое имя человека — " + vitalii.getName());

        System.out.println("Изначальное имя кота — " + nemo.getName());
        nemo.setName("Василий");
        nemo.setAge(2);
        System.out.println("Новое имя кота — " + nemo.getName()+", возраст- "+nemo.getAge());

        begemot.sounds();
        muhtar.sounds();

        Cat nemo1 = new Cat("Nemo", 1);
        // System.out.println(nemo == nemo1);//сравнение ссылок
        // System.out.println(nemo.equals(nemo1));// метод сравнения объектов
        // System.out.println("хэш код Немо-"+nemo.hashCode());
        // System.out.println("хэш код Немо1-"+nemo1.hashCode());
    }
}
