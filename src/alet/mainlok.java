package alet;

public class mainlok {
    public static void main(String[] args) {
    lok Smeshenie1 = new lok();
    lok Smeshenie3 = new lok(3,12);
    lok Smeshenie2 = new lok(6, 31);
    System.out.println("1." + Smeshenie1);
    System.out.println("2." + Smeshenie2);
    System.out.println("3." + Smeshenie3);
    Smeshenie1.Dvijenie(21,79);
    System.out.println("передвигаем первый мяч : " + Smeshenie1);
    Smeshenie2.Dvijenie(-70.43,-3.95);
    System.out.println("передвигаем второй мяч : " + Smeshenie2);
    Smeshenie3.Dvijenie(-24,-9);
    System.out.println("передвигаем третий мяч : " + Smeshenie3);
}
}
