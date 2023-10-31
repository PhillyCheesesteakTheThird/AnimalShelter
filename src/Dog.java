public abstract class Dog implements AdoptableAnimal{
    protected String name;
    protected String description;
    protected double price;
    public Dog(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
    public abstract String getBreed();
}
