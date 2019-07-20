public class Droid {

    String name;
    int battery;

    public Droid(String droidName){
        name = droidName;
        battery = 100;
    }

    public void performTask(String task){
        battery = battery - 10;
        System.out.println(name + " is performing task: " + task);
    }

    public String energyReport(){
        return "I have " + battery + " battery life left";
    }

    public int energyTransfer(int num){
        battery = battery - num;
        return num;
    }

    public int energyRecieve(int num){
        battery = battery + num;
        return num;
    }


    public String toString(){
        return "Hello, I'm the droid " + name;
    }

    public static void main(String[] args){
        Droid Eliza = new Droid("Eliza");
        Droid Chris = new Droid("Chris");

        Chris.energyRecieve(Eliza.energyTransfer(50));

        System.out.println(Chris.energyReport());
    }
}
