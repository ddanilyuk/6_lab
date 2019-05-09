import java.util.Arrays;

public class Circlet {
    private int numOfJewels;
    private Jewel[] jewels;
    private int counter = 0;
    private int circletTotalCost = 0;


    public Circlet(int numOfJewels) {
        this.numOfJewels = numOfJewels;
        jewels = new Jewel[numOfJewels];
    }

    public void addDiamond(String name, int mass, int costPerCarat, double purity) {
        if (counter < numOfJewels) {
            jewels[counter++] = new Diamond(name, mass, costPerCarat, purity);
        } else {
            System.out.println("Circlet size is exceeded!");
        }
    }

    public void addEmerald(String name, int mass, int costPerCarat, double purity) {
        if (counter < numOfJewels) {
            jewels[counter++] = new Emerald(name, mass, costPerCarat, purity);
        } else {
            System.out.println("Circlet size is exceeded!");
        }
    }

    public void addRuby(String name, int mass, int costPerCarat, double purity) {
        if (counter < numOfJewels) {
            jewels[counter++] = new Ruby(name, mass, costPerCarat, purity);
        } else {
            System.out.println("Circlet size is exceeded!");
        }
    }

    public int circletCost(){
        for (Jewel jewel:jewels) {
            circletTotalCost += jewel.getTotalCost();
        }
        return circletTotalCost;
    }


    public void sortTotalCost() {
        Arrays.sort(jewels, new ComparatorByCost());
    }

    public void findJewelsWithPurity(double min, double max) {
        for (Jewel jewel : jewels) {
            if (jewel.getPurity() >= min & jewel.getPurity() <= max) {
                System.out.println(jewel);
            }
        }
    }

    public Jewel[] getJewels() {
        return jewels;
    }

    @Override
    public String toString() {
        String res = "Circlet of jewels contains " + counter + " jewel with total cost: " + "\n";
        for (int i = 0; i < counter; i++) {
            res += jewels[i].toString() + '\n';
        }
        return res;
    }
}
