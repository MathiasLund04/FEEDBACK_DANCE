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

        System.out.println(ConsolStyle.GREEN + "\n=== VELKOMMEN TIL FEEDBACK DANCE BATTLE ===" + ConsolStyle.RESET);

        for (Dancer d : dancers) {
            System.out.println( "\n____________________");
            d.introduce();
            d.showInfo();
            System.out.print(ConsolStyle.UNDERLINE );
            d.dance();
            System.out.print(ConsolStyle.RESET);


            if (d instanceof ElectricBoogieDancer) {
                System.out.print(ConsolStyle.GREEN);
                ((ElectricBoogieDancer) d).popAndLock();
                System.out.print(ConsolStyle.RESET);
            }
        }

        // Kampen
        System.out.println(ConsolStyle.GREEN +
                "\n=== LAD KAMPENE STARTE ===" +
                ConsolStyle.RESET);

        DanceBattle battle1 = new DanceBattle(dancers.get(0), dancers.get(1));
        DanceBattle battle2 = new DanceBattle(dancers.get(2), dancers.get(3));
        DanceBattle battle3 = new DanceBattle(dancers.get(4), dancers.get(5));

        runBattle(battle1);
        runBattle(battle2);
        runBattle(battle3);

        dancers.sort(Comparator.comparingInt(Dancer::getPoints).reversed());
        System.out.println(ConsolStyle.GREEN +
                "\n=== SLUTRESULTAT ===" +
                ConsolStyle.RESET);
        System.out.println("------------------------------------------");

        int place = 1;
        for (Dancer d : dancers) {
            System.out.println(ConsolStyle.CYAN  +
                    place++ + ". " + d.name + ConsolStyle.RESET +
                    " (" + d.points + " point)");
        }
        System.out.println(ConsolStyle.UNDERLINE + "\nTak fordi du så med! " + ConsolStyle.RESET);
    }


    private static void runBattle(DanceBattle battle) {
        System.out.println(ConsolStyle.CYAN );
        battle.startBattle();
        System.out.println(ConsolStyle.RESET);
    }
}