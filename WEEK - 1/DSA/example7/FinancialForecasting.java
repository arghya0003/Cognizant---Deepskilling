public class FinancialForecasting {

    // Recursive method 
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }

        return predictFutureValue(currentValue * (1 + growthRate / 100), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 12345;   
        double growthRate = 9.46;        
        int years = 25;

        double futureValue = predictFutureValue(currentValue, growthRate, years);

        System.out.printf("Current Value : %.2f\n", currentValue);
        System.out.printf("Growth Rate   : %.2f%%\n", growthRate);
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : %.2f\n", futureValue);
    }
}