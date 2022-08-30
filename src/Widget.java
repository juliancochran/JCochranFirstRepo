public class Widget {
    private String name;
    private int id;
    private double cost;

    public Widget() {
        name = "";
        id = 0;
        cost = 0.;
    }

    public Widget(String n, int i, double c)    {
        name = n;
        id = i;
        cost = c;
    }

    public String toString()    {
        return name + " ID: " + id + " cost: $" + cost;
    }
}
