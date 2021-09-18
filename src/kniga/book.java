package kniga;

public class book {
    private String tip;
    private int cost;
    public book(String q, int w){
        tip = q;
        cost = w;
    }
    public book(String q){
        tip = q;
        cost = 300;
    }
    public book(){
        tip = "Garripotter";
        cost = 0;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setTip(String tip) {this.tip = tip;}
    public String getTip(String tip){
        return tip;
    }
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "book{" +
                "tip='" + tip + '\'' +
                ", cost=" + cost +
                '}';
    }

    public void intoValue(){
        System.out.println(tip+"'s price in Russia "+cost*80+" rubles");
    }
}

