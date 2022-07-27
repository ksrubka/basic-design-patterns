package co.devfoundry.house;

public class HouseDirector {

    private final HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse() {
        return houseBuilder
                .walls()
                .floors()
                .rooms()
                .roof()
                .windows()
                .doors()
                .garage()
                .build();
    }
}
