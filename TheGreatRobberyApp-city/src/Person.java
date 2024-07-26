public abstract class Person {
    private String name;
    private String nickname;
    private int yearOfoBorn;
    private String expertln;
    private Item[] items;   
   
    public Person(String name, String nickname, int yearOfoBorn, String expertln, Item[] items) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfoBorn = yearOfoBorn;
        this.expertln = expertln;
        this.items = items;
    }
    public void printBioData() {
        System.out.println("Name: " + name + " (" + nickname + ")");
        System.out.println("Year of born: " + yearOfoBorn);
        System.out.println("Expert in: " + expertln);
        System.out.println("The person has the following items:");
        for (Item item:items) {
            System.out.println("-" + item.getName());
        }
    }
    public String getName() {
        return name;
    }
    public String getNickname() {
        return nickname;
    }
    
}
