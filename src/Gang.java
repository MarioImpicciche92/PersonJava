import java.util.Random;

public class Gang {
    
    private Criminal[] criminal = new Criminal[2];
    private Random RAndomNumberGenerator=new Random();
    private double sumRobbedValue; 


Gang(){
    Item[] RobberyItems=new Item[2];
    RobberyItems[0]=new Item("Blunt swiss knife", 10.5);
    RobberyItems[1]=new Item("Half rotten apple", 0.00);
    Criminal rob=new Criminal("Rob", "the head", 1976, "breaking in", RobberyItems);

    Item[] bobbyItems=new Item[2];
    bobbyItems[0]=new Item("Baseball bat", 20.0);
    bobbyItems[1]=new Item("Toothpick", 0.5);
    Criminal bob=new Criminal("Bobby", "the mountain", 1978, "knocking out", bobbyItems);
}
}