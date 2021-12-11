package practika9;
import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class mop {
    public static void main(String[] args) {

    String mercury = new String("Меркурий");
    String venus = new String("Венера");
    String earth = new String("Земля");
    String mars = new String("Марс");
    String jupiter = new String("Юпитер");
    String saturn = new String("Сатурн");

    ArrayList<String> solarSystem1 = new ArrayList<>();
    ArrayList<String> solarSystem2 = new ArrayList<>();


    solarSystem1.add(0, mercury);
    solarSystem1.add(1, venus);
    solarSystem1.add(2, earth);
    solarSystem2.add(0, earth);
    solarSystem2.add(1, jupiter);
    solarSystem2.add(2, saturn);
    solarSystem2.add(3, earth);



    solarSystem2.remove(3);


    solarSystem2.set(0, mars);


    Collections.shuffle(solarSystem2);
    for (int i = 0; i < solarSystem2.size(); i++) {
        System.out.println(solarSystem2.get(i));
    }


    int index = (int) (Math.random() * ((2 - 0) + 1)) + 0;
    System.out.println("\n" + solarSystem2.get(index));


    System.out.println("\n" + solarSystem2.indexOf("Марс"));


    System.out.println("\n" + solarSystem2.contains("Марс"));


    System.out.println();
    Collections.sort(solarSystem2);
    for (int i = 0; i < solarSystem2.size(); i++) {
        System.out.println(solarSystem2.get(i));
    }


    if(!solarSystem2.isEmpty())
        System.out.println("\nmassiv isnt empty");

}
}
