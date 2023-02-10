package ss07_abstract_interface.demo;

public class Superman extends Person implements IFly{

    @Override
    public void love() {
        System.out.println("Tinh yeu cua superman");
    }

    @Override
    public void fly() {
        System.out.println("Bay bang suc manh sieu nhien");
    }
}
