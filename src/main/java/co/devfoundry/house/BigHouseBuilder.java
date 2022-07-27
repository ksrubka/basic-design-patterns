package co.devfoundry.house;

public class BigHouseBuilder implements HouseBuilder {

    private final House house;

    public BigHouseBuilder() {
        this.house = new House();
    }

    public BigHouseBuilder walls() {
        this.house.setWalls("big walls");
        return this;
    }

    public BigHouseBuilder floors() {
        this.house.setFloors("big floors");
        return this;
    }

    public BigHouseBuilder rooms() {
        this.house.setRooms("big rooms");
        return this;
    }

    public BigHouseBuilder roof() {
        this.house.setRoof("big roof");
        return this;
    }

    public BigHouseBuilder windows() {
        this.house.setWindows("big windows");
        return this;
    }

    public BigHouseBuilder doors() {
        this.house.setDoors("big doors");
        return this;
    }

    public BigHouseBuilder garage() {
        this.house.setGarage("big garage");
        return this;
    }

    public House build() {
        return house;
    }

}
