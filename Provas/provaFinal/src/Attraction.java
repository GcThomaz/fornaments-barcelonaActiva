public class Attraction {
    
    //ATRIBUTTES

    protected String name;
    protected float entrance;
    protected byte minAge;
    protected int colection;
    protected int users;    

    //CONSTRUCTOR

    public Attraction(String name, float entrance, byte minAge, int colection, int users) {
        this.name = name;
        this.entrance = entrance;
        this.minAge = minAge;
        this.colection = colection;
        this.users = users;
    }

    //GETTERS

    public String getName() {
        return name;
    }

    public float getEntrance() {
        return entrance;
    }

    public byte getMinAge() {
        return minAge;
    }

    public int getColection() {
        return colection;
    }

    public int getUsers() {
        return users;
    }
    
    //[METHOD: useAttraction]

    public void useAttraction() {
        
    }

    //[METHOD: maintain()]
    
    public void maintain() {

    }
}
