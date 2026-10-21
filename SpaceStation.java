public class SpaceStation {

    public static void main(String[] args) {

        private CrewMember[] team;

        private SectionType[] sections = {
                SectionType.START,
                SectionType.OXYGENLOSS,
                SectionTYpe.LAB,
                SectionType.REACTOR
        };

        public SpaceStation(CreqMember [] team) {

            System.out.println("WELCOME TO RYMDSTATION 404!!");

            for (SectionType sectionType : sections) {

                switch (sectionType){
                    case START:
                        System.out.println("Mission starting 3..2...1...LET'S GOOO!!");
                        for (CrewMember crewMember: team)
                }
            }
        }

    }

}
