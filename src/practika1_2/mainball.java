package practika1_2;
import java.lang.*;
public class mainball {
    public static void main(String[] args) {
            ball d1 = new ball("Tennis", 2);
            ball d2 = new ball("Voleyball", 7);
            ball d3 = new ball("Basketball",8);
            System.out.println(d1);
            d1.intoRubels();
            d2.intoRubels();
            d3.intoRubels();

    }
}
