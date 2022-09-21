public class Sep20 {
    public static void main(String[] args) {
        calculateGrossProfit(new int[] {30, 20, 50, 10}, new int[]{20, 30, 10, 20});
    }
    public static void calculateGrossProfit(int[] dailyRevArr, int[] dailyExpArr){
        int dailyRev = 0;
        int dailyExp = 0;
        for (int i = 0; i < dailyRevArr.length; i++){
            dailyRev += dailyRevArr[i];
            dailyExp += dailyExpArr[i];
        }
        int grossProfit = dailyRev - dailyExp;
        System.out.println(grossProfit);
    }
}