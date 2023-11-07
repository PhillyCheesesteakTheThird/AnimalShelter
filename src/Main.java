// the "main" class for the program
public class Main {
    public static void main(String[] args) {
        AdoptableAnimal[] animals = new AdoptableAnimal[] {
                new Cat("Mo", "Small but fat", 200000),
                new Cat("Po", "Fat", 2),
                new ShihTzu("Tsubi", "Wow!","Havashu mix",200),
                new Pitbull("Cupcake", "The best","Pitbull",20)
        };

        for (AdoptableAnimal animal : animals) {
            String animalType;
            if (animal instanceof Cat) {
                animalType = "cat";
            } else {
                animalType = "dog";
            }
            System.out.println("Adopting out a " + animalType
                    + "\nTheir name is " + animal.getName()
                    + "\nThey cost " + animal.getPrice()
                    + "\nOur staff describes them thusly: " + animal.getDescription());

            if (animal instanceof Dog) {
                System.out.println("The dog's breed is " + ((Dog) animal).getBreed());
            }
        }
    }
}
