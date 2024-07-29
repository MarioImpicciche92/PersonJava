public class City {
    Building[] building = new Building[1];

    public City(){
        Item[] bankItems = new Item[2];
        bankItems[0] = new Item("Letter Opener",2.5); // Items to control 
        bankItems[1] = new Item("Stamp",2.5);
        building[0] = new Building("Bank", bankItems);
    }

    public Building[] getBuilding() {
        return building;
    }
    
    
}
