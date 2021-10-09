package practika3;

public class functhumanset extends abstracthuman {

    public functhumanset() {
}

    void makeOlder(int year) {
        this.age += year;
        System.out.println("старение на " + year + "лет");
    }

    void makeYonger(int year) {
        this.age -= year;
        System.out.println("омомоложение на " + year + "лет");
    }

    void makeItGrow(double n) {
        this.height += n;
        System.out.println("Вырости на " + n + "см.");
    }

    void dead() {
        this.alive = false;
        System.out.println("закапывайте!");
    }

    void live() {
        this.alive = true;
        System.out.println("будущее уже произошло!");
    }
}


