public class Chocolate {
    // list all the attributes / fields
    String type;
    int calories;
    int weight;

    // method constructor
    public Chocolate () { //default constructor
        type = "Snickers";
        calories = 200;
        weight = 50;
    }

    // Main Method
    public static void main(String[] args) {
        Chocolate obj1 = new Chocolate();
        System.out.println("The first chocolate bar is " + obj1.type + ", calories: " + obj1.calories + ", weight: " + obj1.weight);
    }
}
