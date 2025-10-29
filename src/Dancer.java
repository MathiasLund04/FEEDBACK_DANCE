
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
        System.out.println( ConsolStyle.BLUE+ "Navn: " + name );
        System.out.println( "Stil: " + style);
        System.out.println( "Points: " + points + ConsolStyle.RESET);
    }

    public final void introduce(){
    System.out.println( "Her kommer "+ name.toUpperCase() + " med sin " + style+ " Stil"+
            ConsolStyle.RESET);
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
