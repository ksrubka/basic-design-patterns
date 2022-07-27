package co.devfoundry.house;

public interface HouseBuilder {

    HouseBuilder walls();
    HouseBuilder floors();
    HouseBuilder rooms();
    HouseBuilder roof();
    HouseBuilder windows();
    HouseBuilder doors();
    HouseBuilder garage();

    House build();

}
