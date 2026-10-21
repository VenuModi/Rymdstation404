public class SpaceStation {

    CrewMember[] team;
    SectionType[] sections = {
            SectionType.START,
            SectionType.OXYGENLOSS,
            SectionType.LAB,
            SectionType.REACTOR
    };

    public SpaceStation(CrewMember[] team) {
        System.out.println("WELCOME TO RYMDSTATION 404!!");
        for (SectionType sectionType : sections) {

            switch (sectionType) {
                case START:
                    System.out.println("Mission starting 3..2...1...LET'S GOOO!!");
                    for (CrewMember crewMember : team) {
                        System.out.println(crewMember.getName() + "Has " + crewMember.getEnergy());
                    }
                    break;
                case OXYGENLOSS:
                    System.out.println("Oxygen chammber has a leak.");
                    for (CrewMember crewMember : team) {
                        crewMember.lossEnergy(20);
                    }
                    if (team[0].getEnergy() > 0) {
                        System.out.println("Crew member survives oxygen leak");
                    } else {
                        System.out.println("MISSON FAILED");
                        return;
                    }
                    break;
                case LAB:
                    System.out.println("You want to enter the lab but the lab is locked.");
                    for (CrewMember crewMember : team) {
                        crewMember.performTask();
                    }
                    break;

                case REACTOR:
                    System.out.println();
                    boolean repaired = false;
                    for (CrewMember crewMember : team) {
                        if (crewMember instanceof Repairable) {
                            Repairable repariable = (Repairable) crewMember;
                            repariable.repair();
                            repaired = true;
                            break;
                        }
                    }
                    if (repaired) {
                        System.out.println("MISSION SUCCESSFUL!!");
                    } else {
                        System.out.println("MISSION FAILED!!");
                    }
            }
        }

    }

}
