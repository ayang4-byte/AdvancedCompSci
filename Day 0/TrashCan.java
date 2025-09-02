public class TrashCan { // This is the CLASS

    private String color; //= "tan" These are INSTANCES
    private double weight; //= 20.25
    private int cost; //= 50
    private String practicality; //= "10/10"
    private String size; //= "L"
    private String smell; //= 'Very'

    public TrashCan() { // This is a CONSTRUCTOR
        color = "Grey";
        weight = 20.25;
        cost = 50;
        practicality = "10/10";
        size = "L";
        smell = "Very";

    }
// public void/int/double/etc (type) Deposit (identifier) (parameters or argument in here)
// public type identifier(parameters or argument)
//Parameters could be (double(a type) amount)
    public void Deposit() { // These are METHODS
        weight += 1;
        System.out.println("Congratulations!");
        return;
    }

    public void Open() {
        System.out.println("The can is open");
        return;
    }

    public void Close() {
        System.out.println("The can is closed");
        return;
    }

    public double getWeight() {
        return weight;
    
    }

    public int Incinerate() {
        if (cost < 0.0001) {
            System.out.println("Stop burning worthless rubbish!");
        }
        else {
            System.out.println("This is a trash can no more.");
        }
        cost = 0;
        practicality = "0/10";
        smell = "None";
        
        return cost;

    }

    public void Facts(double newWeight) {
        newWeight = getWeight();
        System.out.println(color);
        System.out.println(size);
        System.out.println(practicality);
        System.out.println(smell);
        System.out.println(newWeight);
    }
}