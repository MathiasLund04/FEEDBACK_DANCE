public class DanceBattle {

    private final Dancer a;
    private final Dancer b;

    public DanceBattle(Dancer a, Dancer b) {
        this.a = a;
        this.b = b;
    }

    public void startBattle() {
        System.out.println(a.name + " battles " + b.name + "!" );
        a.dance();
        a.scoreDance();
        b.dance();
        b.scoreDance();
        if (a.getPoints() > b.getPoints()) {
            System.out.println(a.name + " vinder med " +(a.getPoints() - b.getPoints()) + " point!"  );

        } else if  (b.getPoints() > a.getPoints()) {
            System.out.println(b.name + " vinder med " + (b.getPoints() - a.getPoints()) + " point!"  );

        } else{
            System.out.println("Det blev uafgjort");
        }
        System.out.println("____________________\n");
    }







}
