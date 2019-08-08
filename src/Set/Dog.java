package Set;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private String color;
    private char sex;

    public Dog(){}

    public Dog(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                sex == dog.sex &&
                name.equals(dog.name) &&
                color.equals(dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, sex);
    }
}
