import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======CIRCLET=======");
        Circlet circlet = new Circlet(3);
        circlet.addDiamond("Diamond", 10, 12, 0.7);
        circlet.addEmerald("Emerald", 5, 14, 0.5);
        circlet.addRuby("Ruby", 15, 14, 0.3);
        System.out.print(circlet);
        System.out.println("Total Circlet cost: " + circlet.circletCost() + "\n");

        System.out.println("=========SORT=========");
        circlet.sortTotalCost();
        System.out.println(circlet);

        System.out.println("=========givenPurity=========");
        double from = 0.3;
        double to = 0.6;
        System.out.println("from: " + from + " === to: " + to);
        circlet.findJewelsWithPurity(from, to);

    }

}
