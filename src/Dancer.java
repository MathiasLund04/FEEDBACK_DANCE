
public class Dancer {

    protected String name;
    protected String style;
    protected int points;

public Dancer(String name,String style){
    this.name = name;
    this.style = style;
    this.points = 0;
}

    public void dance(){
        System.out.println(name + " groover");
    }

    public void showInfo(){
        System.out.println( "Navn: " + name );
        System.out.println( "Stil: " + style);
    }

    public final void introduce(){
    System.out.println( "Her kommer "+ name + " med sin " + style+ " Stil");
    }

    public void scoreDance(){
    int score = (int) (Math.random() * 10)+1;
        points += score;
        System.out.println(name + " tjente " + score + " point! og har nu " + points);
    }

    public int getPoints() {
        return points;
    }

}
