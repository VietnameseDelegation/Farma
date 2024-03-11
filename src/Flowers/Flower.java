package Flowers;

public abstract class Flower {

    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;
    protected TypeOfFlower type;
    protected boolean harvestable = false;

    public Flower(String name, double price, double neededArea, double chanceOfGrowth,TypeOfFlower type) {
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        this.chanceOfGrowth = chanceOfGrowth;
        this.type = type;
    }

    public void growth(){
        setChanceOfGrowth(chanceOfGrowth+10);
        if (chanceOfGrowth>=100){
            setHarvestable(true);
        }

    }

    public void setChanceOfGrowth(double chanceOfGrowth) {
        this.chanceOfGrowth = chanceOfGrowth;
    }

    public void setHarvestable(boolean harvestable) {
        this.harvestable = harvestable;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
