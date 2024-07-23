public class City {

    

    Building[] building = new Building[1];

    public City(){

         Item[] bankItems = new Item[2];
        bankItems[0]=new Item(name="Letter Opener",value="2.5"); // Items to control 
    bankItems[1] = new Item(name="Stamp",value="2.5");
    buildings[0] = new Building("Bank", bankItems);
    }
    
    
}
