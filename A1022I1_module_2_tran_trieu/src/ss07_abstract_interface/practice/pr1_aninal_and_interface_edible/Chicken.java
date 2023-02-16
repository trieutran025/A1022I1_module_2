package ss07_abstract_interface.practice.pr1_aninal_and_interface_edible;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howtoEat() {
        return "Could be fried";
    }
}
