public class Main {

    public static void main(String[] args) {
        Animal newAnimal = new Animal(4, "������");

        newAnimal.setName("�����");


        System.out.printf("���������� ���: %d \n", newAnimal.getLegs());
        System.out.println("���: " + newAnimal.getName ());
        System.out.println("��������: " + newAnimal.getHungry());

        newAnimal.eat();


        System.out.println("�������� " + newAnimal.getHungry());

        newAnimal.eat();

    }
}
