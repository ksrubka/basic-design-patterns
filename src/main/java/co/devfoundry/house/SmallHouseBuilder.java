package co.devfoundry.house;

public class SmallHouseBuilder implements HouseBuilder {

    private final House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    public SmallHouseBuilder walls() {
        this.house.setWalls("small walls");
        return this;
    }

    public SmallHouseBuilder floors() {
        this.house.setFloors("small floors");
        return this;
    }

    public SmallHouseBuilder rooms() {
        this.house.setRooms("small rooms");
        return this;
    }

    public SmallHouseBuilder roof() {
        this.house.setRoof("small roof");
        return this;
    }

    public SmallHouseBuilder windows() {
        this.house.setWindows("small windows");
        return this;
    }

    public SmallHouseBuilder doors() {
        this.house.setDoors("small doors");
        return this;
    }

    public SmallHouseBuilder garage() {
        this.house.setGarage("small garage");
        return this;
    }

    public House build() {
        return house;
    }
}
