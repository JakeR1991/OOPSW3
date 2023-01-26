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

    // parameterised constructor
    public Chocolate (String type, int calories, int weight) {
        this.type = type;
        this.calories = calories;
        this.weight = weight;
    }

    // Main Method
    public static void main(String[] args) {
        Chocolate obj1 = new Chocolate();
        System.out.println("The first chocolate bar is " + obj1.type + ", calories: " + obj1.calories + ", weight: " + obj1.weight);

        // object 2
        Chocolate obj2 = new Chocolate("KitKat", 150, 150);
        System.out.println("The second chocolate bar is " + obj2.type + ", calories: " + obj2.calories + ", weight: " + obj2.weight);

        // object 3
        Chocolate obj3 = new Chocolate("Mars", 210, 170);
        System.out.println("The third chocolate bar is " + obj3.type + ", calories: " + obj3.calories + ", weight: " + obj3.weight);

        // object 4
        Chocolate obj4 = new Chocolate("Bounty", 140, 130);
        System.out.println("The fourth chocolate bar is " + obj4.type + ", calories: " + obj4.calories + ", weight: " + obj4.weight);

    }
}
