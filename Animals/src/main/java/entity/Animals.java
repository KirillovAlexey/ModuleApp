package entity;

public class Animals {

    private String name;
    private int age;
    private String type;

    public Animals(String pet1, int i, String cat) {
        this.name = pet1;
        this.age = i;
        this.type = cat;
    }

    public String getName() {
        return name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animals(){

    }
}
