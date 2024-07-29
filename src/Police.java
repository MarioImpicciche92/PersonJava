import java.util.Random;

public class Police {
    private Detective adamPalmer;
    private Random randomNumber = new Random();

    public Police(Detective adamPalmer) {
        this.adamPalmer = adamPalmer;

        Item[] adamitItems = new Item[2];
        adamitItems[0] = new Item("Revolver", 500);
        adamitItems[1] = new Item("Magnifyng glass", 10.0);

        adamPalmer = new Detective("Adam Palmer", "Coyote", 1960, "chess", adamitItems);
    }

    public boolean areCriminalsCaught(){
        int RandomGeneratorCriminal = randomNumber.nextInt(101);

        if(RandomGeneratorCriminal >= Detective.SUCCESS_PERCENTAGE){
            return false;
        }

        else{
            return true;
        }
    }

    public boolean cachCriminals(Gang gang){
        
        if(areCriminalsCaught()){
            System.out.println(adamPalmer.getName() + " managed to catch the gang");
            if (gang.getSumRobbedValue() > 0) {
                System.out.println("The stolen items are recovered.");
                System.out.println("Their overall value is estimated to $" + gang.getSumRobbedValue());
            } else {
                System.out.println("The gang couldn't steal anything.");
            }
            return true;
        } else {
            System.out.println(adamPalmer.getName() + " couldn't catch the criminals.");
            System.out.println("They managed to steal items valued $" + gang.getSumRobbedValue());
            return false;
        }
        
        
    }
}


