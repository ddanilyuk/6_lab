public class Main {
    public static void main(String[] args) {
        System.out.println("=======CIRCLET=======");
        Circlet circlet = new Circlet(3);
        circlet.addDiamond("Diamond", 10, 12, 0.7);
        circlet.addDiamond("Some", 15, 14, 0.3);
        circlet.addDiamond("Some_2", 5, 14, 0.5);
        System.out.println(circlet);

        System.out.println("=========SORT=========");
        circlet.sortTotalCost();
        System.out.println(circlet);

        System.out.println("=========givenPurity=========");
        circlet.findJewelsWithPurity(0.3, 0.6);


        //try
        Diamond diamond = new Diamond("s", 12, 12, 0.3);
        //System.out.println(diamond.getTotalCost());
    }

}
