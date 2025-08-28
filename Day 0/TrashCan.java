public class TrashCan {

    private String color; //= "tan"
    private int weight; //= 20
    private int cost; //= 50
    private String practicality; //= "10/10"
    private String size; //= "L"
    private String smell; //= 'Very'

    public TrashCan() {
        color = "Grey";
        weight = 20;
        cost = 50;
        practicality = "10/10";
        size = "L";
        smell = "Very";

    }

    public void Deposit() {
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

    public int getWeight() {
        return weight;
    
    }

    public int Incinerate() {
        if (cost < 0.0001) {
            System.out.println("Stop burning worthless rubbish!");
        }
        if (cost > 0.0001) {
            System.out.println("This is a trash can no more.");
        }
        cost = 0;
        practicality = "0/10";
        smell = "None";
        
        return cost;

    }
}