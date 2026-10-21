public class Medic extends CrewMember{

    public Medic(String name, int energy){

        super(name, energy);
    }

    public void performTask(){
        System.out.println(name + " is checking the engineer's energy.");
    }

    public void restoreEnergy(CrewMember crewMember){
        crewMember.energy += 15;

        System.out.println(name + " restored 15% energy to " + crewMember.getName());
    }
}