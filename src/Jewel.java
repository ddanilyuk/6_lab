public class Jewel {
    private String name;
    private int mass;
    private int costPerCarat;
    private double purity;

    public Jewel(String name, int mass, int costPerCarat, double purity) {
        this.name = name;
        this.mass = mass;
        this.costPerCarat = costPerCarat;
        this.purity = purity;
    }

    @Override
    public String toString(){
        return "Name: " + name + " mass: " + mass + " costPerCarat: " + costPerCarat + " purity: " + purity;
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public int getCostPerCarat() {
        return costPerCarat;
    }

    public double getPurity() {
        return purity;
    }
}
