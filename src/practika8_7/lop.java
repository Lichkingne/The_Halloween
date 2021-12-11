package practika8_7;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.lang.Math;

public class lop {
    public static void main(String[] args) {
        Pet obj = new Pet(0);
        obj.entry();
        obj.call();
        System.out.print(obj.repeats());
    }
}

class Pet{
    public int index;
    public int num;
    Map<String, Pet> hashmap = new HashMap<String, Pet>();
    ArrayList<String> people = new ArrayList<String>();
    ArrayList<Integer> digits = new ArrayList<>();

    Pet(int value) { index=value; }
    int get(){ return index; }

    void entry(){

        people.add("Eliot");
        people.add("Larisa");
        people.add("LEo");
        people.add("Samuel");
        people.add("Nikita");

        int max = 10;
        int min = 1;

        for(int i=0; i< people.size(); i++){
            num = (int) (Math.random() * ((max - min) + 1)) + min;
            digits.add(num);
            hashmap.put(people.get(i), new Pet(num));
        }
    }


    void call(){
        for(Map.Entry<String, Pet> item : hashmap.entrySet()){
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().get());
        }
    }

    int repeats(){
        int k = 0;
        for(int i=0; i<digits.size();i++)
            for (int j = 0; j < digits.size(); j++)
                if (i != j)
                    if (digits.get(i) == digits.get(j))
                        k++;

        return k;

    }
}
