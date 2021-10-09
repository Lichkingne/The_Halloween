package practika3;

public class humansetting {
    public humansetting() {
    }

    public static void main(String[] args) {
        functhumanset arturio = new functhumanset();
        arturio.setAll(182.0D, "Артур", 'Ж', false, 19);
        System.out.println("Артур : " + arturio);
        arturio.makeOlder(8);
        System.out.println("Артур : " + arturio);
        arturio.makeYonger(2);
        System.out.println("Артур : " + arturio);
        arturio.makeItGrow(19.5D);
        System.out.println("Артур : " + arturio);
        arturio.dead();
        System.out.println("Света : " + arturio);
        arturio.live();
        System.out.println("Света : " + arturio);
        arturio.setSex('M');
        System.out.println(arturio.getSex());
    }
}

