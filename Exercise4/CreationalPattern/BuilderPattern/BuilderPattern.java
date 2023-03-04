package CreationalPattern.BuilderPattern;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class BuilderPattern {

    /**
     * The main method creates a house object using the Builder pattern, specifying
     * the number of each type of room.
     * The resulting house object is printed to the console.
     * 
     * @param args The command line arguments.
     */

    public static void main(String[] args) {
        House myHouse = new House.BuildHouse().setHall("1").setDinning("1").setPoojaRoom("1").setBedRoom("2")
                .setBathRoom("2").build();
        System.out.println(myHouse);
    }
}
/**
 * The House class represents a house object with a specific configuration of
 * rooms.
 */

class House {
    class Rooms {
        String hall, dinning, poojaRoom, bedRoom, bathRoom;

        /**
         * Creates a new Rooms object with the specified number of rooms of each type.
         * 
         * @param hall      The number of halls.
         * @param dinning   The number of dining rooms.
         * @param poojaRoom The number of pooja rooms.
         * @param bedRoom   The number of bedrooms.
         * @param bathRoom  The number of bathrooms.
         */

        public Rooms(String hall, String dinning, String poojaRoom, String bedRoom, String bathRoom) {
            this.hall = hall;
            this.dinning = dinning;
            this.poojaRoom = poojaRoom;
            this.bedRoom = bedRoom;
            this.bathRoom = bathRoom;
        }

        @Override
        public String toString() {

            return "[Hall=" + hall + ", DiningRooms=" + dinning + ", PoojaRoom=" + poojaRoom + ",BedRoom"
                    + bedRoom + ", BathRoom" + bathRoom + "]";
        }
    }

    Rooms roomsObject;
    String houseName;

    /**
     * Creates a new House object using the specified builder object.
     * 
     * @param bh The builder object.
     */
    public House(BuildHouse bh) {
        roomsObject = new Rooms(bh.hall, bh.dinning, bh.poojaRoom, bh.bedRoom, bh.bathRoom);
        houseName = "Bidda";
    }

    @Override
    public String toString() {

        return "House [Rooms=" + roomsObject + ", HouseName=" + houseName + "]";
    }

    /**
     * The BuildHouse class represents the builder object used to create a new House
     * object.
     */
    static class BuildHouse {
        String hall, dinning, poojaRoom, bedRoom, bathRoom;

        public BuildHouse setHall(String hall) {
            this.hall = hall;
            return this;
        }

        public BuildHouse setDinning(String dinning) {
            this.dinning = dinning;
            return this;
        }

        public BuildHouse setPoojaRoom(String poojaRoom) {
            this.poojaRoom = poojaRoom;
            return this;
        }

        public BuildHouse setBedRoom(String bedRoom) {
            this.bedRoom = bedRoom;
            return this;
        }

        public BuildHouse setBathRoom(String bathRoom) {
            this.bathRoom = bathRoom;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}