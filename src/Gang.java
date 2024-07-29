import java.util.Random;

public class Gang {
    
    private Criminal[] criminal = new Criminal[2];
    private Random randomNumberGenerator = new Random();
    private double sumRobbedValue; 


    Gang(){
        Item[] RobberyItems = new Item[2];
        RobberyItems[0] = new Item("Blunt swiss knife", 10.5);
        RobberyItems[1] = new Item("Half rotten apple", 0.00);

        Criminal rob = new Criminal("Rob", "the head", 1976, "breaking in", RobberyItems);
        criminal[0] = rob;

        Item[] bobbyItems = new Item[2];
        bobbyItems[0] = new Item("Baseball bat", 20.0);
        bobbyItems[1] = new Item("Toothpick", 0.5);
        
        Criminal bob = new Criminal("Bobby", "the mountain", 1978, "knocking out", bobbyItems);

        criminal[1] = bob;
    }


    public double getSumRobbedValue() {
        return sumRobbedValue;
    }

    public void printGangInfo(){
        System.out.println("---------------------------");

        for (Criminal criminals:criminal) {
            criminals.printBioData();
        }
    }

    private boolean isSuccessFullRobery(){
        int randomNumber = randomNumberGenerator.nextInt(101);
        int successChange = criminal.length * Criminal.SUCCESS_PERCENTAGE;

        if (randomNumber <= successChange) {
            return true;
        } else {
            return false;
        }
    }

    public void letsRob(Building[] buildings) {
        int randomBuildingIndex = randomNumberGenerator.nextInt(buildings.length);

        System.out.println("-------------------------------");

        if (isSuccessFullRobery()) {
            System.out.println("The gang managed to rob the following items from the " + buildings[randomBuildingIndex].getName() + ":");

            for (Item item : buildings[randomBuildingIndex].getItems()) {
                sumRobbedValue += item.getValue();

                System.out.println("-" + item.getName());
            }
        } else {
            System.out.println("The gang tried to rob the " + buildings[randomBuildingIndex].getName() + " but they failed.");
        }

    }
}