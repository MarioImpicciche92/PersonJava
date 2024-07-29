public class TheGreatRobberyApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        
        City city = new City();
        Gang theGang = new Gang();
        Police police = new Police(null);
        theGang.printGangInfo();
        System.out.println();
        do {
            theGang.letsRob(city.getBuilding());
        } while (!police.cachCriminals(theGang));
   
    }
}
