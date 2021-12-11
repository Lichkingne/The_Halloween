package practika1_2;

public class ball {
    private String type;
    private int price;
    public ball(String t, int p){
        type = t;
        price = p;
    }
    public ball(String t){
        type = t;
        price = 300;
    }
    public ball(){
        type = "Voleiball";
        price = 0;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType(String type){
        return type;
    }
    public int getPrice() {
        return price;
    }
    public String toString(){
        return this.type+", price "+this.price;
    }
    public void intoRubels(){
        System.out.println(type+"'s price in Russia "+price*74+" rubles");
    }
}
