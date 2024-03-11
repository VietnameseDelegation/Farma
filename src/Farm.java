import java.util.ArrayList;
import Flowers.*;
import Animals.*;

public class Farm {
    private int maxAmount = 0;
    ArrayList<Flower> flowerPlantation = new ArrayList<>();
    // zasadit, zavlažovat a sklízet
    public void harvest(Flower flower){
        flowerPlantation.remove(flower);
    }

    public void plant(Flower flower){
        flowerPlantation.add(flower);
    }
}
