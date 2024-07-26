public class City {
    Building[] building = new Building[4];

    public City(){
        Item[] bankItems = new Item[2];
        bankItems[0] = new Item("Letter Opener",2.5); // Items to control 
        bankItems[1] = new Item("Stamp",2.5);
        building[0] = new Building("Bank", bankItems);
    
        Item [] mansionItems= new Item[2];
        mansionItems[0]=new Item("Pair of fancy shoes", 2.5);
        mansionItems[1]=new Item("Pencil", 2.0);
        building[1]=new Building("Mansion", mansionItems);

        Item[] postOfficItems=new Item[2];
        postOfficItems[0]=new Item("Letter of Jenny", 1.5);
        postOfficItems[1]=new Item("Pencil", 2.0);
        building[2]=new Building("PostOffice", postOfficItems);

        Item[] supermarketItemsItem=new Item[2];
        supermarketItemsItem[0]=new Item("A loaf of bread", 2.5);
        supermarketItemsItem[1]= new Item("A bag of tea", 6.5);
        building[3]=new Building("Supermarket", supermarketItemsItem);
    }

    public Building[] getBuilding() {
        return building;
    }
    
    
}
