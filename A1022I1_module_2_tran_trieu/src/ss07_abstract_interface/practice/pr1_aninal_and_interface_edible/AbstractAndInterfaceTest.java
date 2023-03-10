package ss07_abstract_interface.practice.pr1_aninal_and_interface_edible;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for(Fruit fruit :fruits){
            System.out.println(fruit.howtoEat());
        }
    }
}
