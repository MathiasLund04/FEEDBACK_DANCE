public class ElectricBoogieDancer extends Dancer{
    public ElectricBoogieDancer(String name, String style) {
        super(name, style);

    }

    @Override
    public void dance(){
        System.out.println(name + " danser med robot-agtige bevægelser!");
    }
    public void popAndLock(){
        System.out.println(name + " popper og locker!");
    }
}
