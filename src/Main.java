public class Main {

    public static void main(String[] args) {
        Animal newAnimal = new Animal(4, "Васька");

        newAnimal.setName("Мурка");


        System.out.printf("Количество ног: %d \n", newAnimal.getLegs());
        System.out.println("Имя: " + newAnimal.getName ());
        System.out.println("Голодный: " + newAnimal.getHungry());

        newAnimal.eat();


        System.out.println("Голодный " + newAnimal.getHungry());

        newAnimal.eat();

    }
}
