public class Criminal extends Person {

    static final int SUCCESS_PERCENTAGE=20;
    public Criminal (String name, String nickname, int yearOfoBorn, String expertln, Item[] items){
            super(name,nickname,yearOfoBorn,expertln,items);
}

@Override
public void printBioData() {
    System.out.println("Criminal person:");
    super.printBioData();
}
}
