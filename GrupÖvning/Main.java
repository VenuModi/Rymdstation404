public class Main {

    public static void main(String[] args) {

        Engineer engineer = new Engineer("Ouras", 100);
        Medic medic = new Medic("Ramta", 100);

        CrewMember[] team = { engineer, medic };

        SpaceStation station = new SpaceStation(team);

        station.StartMission();

    }

}
