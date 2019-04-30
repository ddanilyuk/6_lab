public class Circlet {
    private int numOfJewels;
    private Jewel[] jewels;
    private int counter = 0;


    public Circlet(int numOfJewels){
        this.numOfJewels = numOfJewels;
        jewels = new Jewel[numOfJewels];
    }

    public void addDiamond(String name, int mass,int costPerCarat, double purity){
        if (counter < numOfJewels){
            jewels[counter++] = new Diamond(name, mass, costPerCarat, purity);
        }else {
            System.out.println("Bouquet size is exceeded!");
        }
    }

    public Jewel[] getJewels() {
        return jewels;
    }

    @Override
    public String toString(){
        String res = "Circlet of jewels contains " + counter + " jewel:\n";
        for (int i = 0; i < counter; i++) {
            res += jewels[i].toString() + '\n';
        }
        return res;
    }
}
