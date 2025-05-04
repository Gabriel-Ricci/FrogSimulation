public class Main {
    public static void main(String[] args) {
        
        FrogSimulation sim1 = new FrogSimulation(24, 5, new int[]{5, 7, -2, 8, 6});
        boolean result1 = sim1.simulate();
        System.out.println(result1);
        
        
        FrogSimulation sim2 = new FrogSimulation(24, 5, new int[]{6, 7, 6, 6});
        boolean result2 = sim2.simulate();
        System.out.println(result2);
        
        
        FrogSimulation sim3 = new FrogSimulation(24, 5, new int[]{6, -6, 31});
        boolean result3 = sim3.simulate();
        System.out.println(result3);
        
        
        FrogSimulation sim4 = new FrogSimulation(24, 5, new int[]{4, 2, -8});
        boolean result4 = sim4.simulate();
        System.out.println(result4);
        
        
        FrogSimulation sim5 = new FrogSimulation(24, 5, new int[]{5, 4, 2, 4, 3});
        boolean result5 = sim5.simulate();
        System.out.println(result5);
        
        
        int[] mixedResult = {20, -5, -5, -5}; 
        FrogSimulation simTest = new FrogSimulation(15, 2, mixedResult);
        double result = simTest.runSimulations(400);
        System.out.println(result);
    }
}