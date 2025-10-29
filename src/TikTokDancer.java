public class TikTokDancer extends Dancer {

    public TikTokDancer(String name, String style) {
        super(name, style);
    }

    @Override
    public void dance(){
        System.out.println(name + " laver tiktok dans!");
    }

}
