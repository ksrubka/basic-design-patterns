package co.devfoundry;

import co.devfoundry.house.BigHouseBuilder;
import co.devfoundry.house.House;
import co.devfoundry.house.HouseDirector;
import co.devfoundry.house.SmallHouseBuilder;

public class Main {

    public static void main(String[] args) {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");
//        House house2 = new House("")

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        House smallHouse = smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        House bigHouse = bigHouseDirector.buildHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}
