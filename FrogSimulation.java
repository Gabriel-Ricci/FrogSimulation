public class FrogSimulation {
    
    private int goalDistance;
    
    private int maxHops;
    
    
    private int[] testHopValues;
    private int currentHopIndex;

    
    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    
    
    public FrogSimulation(int dist, int numHops, int[] hopValues) {
        goalDistance = dist;
        maxHops = numHops;
        testHopValues = hopValues;
        currentHopIndex = 0;
    }

    
    private int hopDistance() {
        
        if (testHopValues != null) {
            if (currentHopIndex < testHopValues.length) {
                return testHopValues[currentHopIndex++];
            }
            
            currentHopIndex = 0;
            return testHopValues[currentHopIndex++];
        }
        
        
        return 5;
    }

    
    public boolean simulate() {
        int position = 0;
        
        for (int count = 0; count < maxHops; count++) {
            
            int distance = hopDistance();
            
            
            position += distance;
            
            
            if (position >= goalDistance) {
                return true;
            }
            
            
            if (position < 0) {
                return false;
            }
        }
        
        
        return false;
    }

    
    public double runSimulations(int num) {
        int successCount = 0;
        
        for (int i = 0; i < num; i++) {
            
            currentHopIndex = 0;
            
            if (simulate()) {
                successCount++;
            }
        }
        
        
        return (double) successCount / num;
    }
    
    
    public void resetHopIndex() {
        currentHopIndex = 0;
    }
}