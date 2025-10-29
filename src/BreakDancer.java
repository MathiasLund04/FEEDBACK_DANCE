class BreakDancer extends Dancer {
    BreakDancer(String name, String style) {
        super(name, style);
    }

    @Override
    public void dance(){
        System.out.println(name + " spinner hurtigt!");
    }
}
