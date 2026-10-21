public abstract class CrewMember {

    protected String name;
    protected int energy;

    public CrewMember(String name, int energy) {

        this.name = name;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }
}
