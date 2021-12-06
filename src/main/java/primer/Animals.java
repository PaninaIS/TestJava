package primer;

abstract class Animals {
    String name;
    int age;

    public Animals(String name, int age) {
    this.name=name;
    this.age=age;
    }
    public Animals() {
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
