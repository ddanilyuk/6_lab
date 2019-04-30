public class Main {
    public static void main(String[] args) {
        Circlet circlet = new Circlet(1);
        circlet.addDiamond("Diamond", 10, 12, 0.7);
        System.out.println(circlet);

        //try
        Diamond diamond = new Diamond("s", 12, 12, 0.3);
        System.out.println(diamond.getTotalCost());
    }

}
