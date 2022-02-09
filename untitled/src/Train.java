public class Train extends TextObject implements TrainStatus{
    private String name;

    public Train(String name) {
        super(name);
        this.name = name;
    }
    public class Carriage extends Item {
        private boolean isManyPeople;
        public Carriage (String name, boolean b1, boolean b2){
            super(name);
            this.name = name;
            isManyPeople = b1;
            isFreePlace = b2;
        }
        boolean isFreePlace; // тут надо private?

        public class Bench extends Item{
            public Bench(String name){
                super(name);
                this.name = name;

            }
        }

        public boolean getIsFreePlace() {
            return isFreePlace;
        }
        public void setFreePlace(boolean freePlace) {
            isFreePlace = freePlace;
        }

        public boolean getIsManyPeople() {
            return isManyPeople;
        }
        public void setManyPeople(boolean manyPeople) {
            isManyPeople = manyPeople;
        }
    }


    public void arrived() {
        System.out.println(name + " arrived to railway station");
    }

    public void departed() {
        System.out.println(name + " departed from railway station");
    }
}
