package practika11;
import java.lang.*;
public class mainbook {
    public static void main(String[] args) {
        book d1 = new book("Garry_potter", 2);
        book d2 = new book("Lord_of_The_Rings", 7);
        book d3 = new book("Arthas_Rise_of_lich_king",8);
        System.out.println(d1);
        d1.intoValue();
        d2.intoValue();
        d3.intoValue();

    }
}
