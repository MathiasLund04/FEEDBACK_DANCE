import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Dancer> dancers = new ArrayList<>();
        Dancer dancer = new Dancer("Bob", "Normale");
        ElectricBoogieDancer ebDancer = new ElectricBoogieDancer("Robert", "Robot");
        ElectricBoogieDancer ebDancer2 = new ElectricBoogieDancer("Roberto", "Robot");
        BreakDancer breakDancer = new BreakDancer("Sonic", "Spinning");
        BreakDancer breakDancer2 = new BreakDancer("Raygun", "Spinning");
        TikTokDancer tokDancer = new TikTokDancer("Oliva", "trendy");


        dancers.add(dancer);
        dancers.add(ebDancer);
        dancers.add(ebDancer2);
        dancers.add(breakDancer);
        dancers.add(breakDancer2);
        dancers.add(tokDancer);

        for (Dancer d : dancers) {
            System.out.println("____________________");
            d.introduce();
            d.showInfo();
            d.dance();
            System.out.println("____________________");
            if (d instanceof ElectricBoogieDancer){
             ((ElectricBoogieDancer) d).popAndLock();
         }
        }

        DanceBattle battle = new DanceBattle(dancers.get(0),dancers.get(1));
        battle.startBattle();
        DanceBattle battle2 = new DanceBattle(dancers.get(2),dancers.get(3));
        battle2.startBattle();
        DanceBattle battle3 = new DanceBattle(dancers.get(4),dancers.get(5));
        battle3.startBattle();

        dancers.sort(Comparator.comparingInt(Dancer::getPoints).reversed());
        for (Dancer d : dancers) {
            System.out.println("____________________");
            System.out.println(d.name + ": " + d.points);
        }






    }
}