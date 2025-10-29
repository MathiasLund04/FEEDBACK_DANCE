public class BreakDancer extends Dancer {
    public BreakDancer(String name, String style) {
        super(name, style);
    }

    @Override
    public void dance(){
        System.out.println(name + " spinner hurtigt!");
    }
}
