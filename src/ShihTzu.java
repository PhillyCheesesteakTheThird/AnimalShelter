public class ShihTzu extends Dog {
    private final String breed;

    public ShihTzu(String name, String description, String breed, double price){
        super(name, description, price);
        this.breed = breed;
    }

    @Override
    public String getBreed() {
        return this.breed;
    }
}
