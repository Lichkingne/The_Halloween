package practika3;

public abstract class abstracthuman {double height;
    String name;
    char sex;
    boolean alive;
    int age;

    abstract void makeOlder(int var1);

    abstract void makeYonger(int var1);

    abstract void makeItGrow(double var1);

    abstract void dead();

    abstract void live();

    public abstracthuman() {
    }

    public abstracthuman(double height, String name, char sex, boolean alive, int age) {
        this.height = height;
        this.name = name;
        this.sex = sex;
        this.alive = alive;
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return this.sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAll(double height, String name, char sex, boolean alive, int age) {
        this.height = height;
        this.name = name;
        this.sex = sex;
        this.alive = alive;
        this.age = age;
    }

    public String toString() {
        return "Human{height=" + this.height + ", name='" + this.name + "', sex=" + this.sex + ", alive=" + this.alive + ", age=" + this.age + "}";
    }
}

