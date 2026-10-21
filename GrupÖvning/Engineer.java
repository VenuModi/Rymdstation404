public class Engineer extends CrewMember implements Repairable{

    public Engineer(String name, int energy){
        super(name, energy);
    }

    public void performTask(){
        System.out.println(name + " is checking the machinery.");
    }

    public void repair(){
        System.out.println(name + " is reparing the reactor!");
    }
}
