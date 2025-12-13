// Main.java — Students version
import java.io.*;
import java.util.Scanner;

public class Main {
    static final int MONTHS = 12;
    static final int DAYS = 28;
    static final int COMMS = 5;
    static String[] commodities = {"Gold", "Oil", "Silver", "Wheat", "Copper"};
    static String[] months = {"January","February","March","April","May","June",
            "July","August","September","October","November","December"};

    public static int[][][] data = new int[MONTHS][DAYS][COMMS];


    // ======== REQUIRED METHOD LOAD DATA (Students fill this) ========
    public static void loadData() {

           }

    // ======== 10 REQUIRED METHODS (Students fill these) ========

    public static String mostProfitableCommodityInMonth(int month) {
        if (month < 0 || month >= 12) {
            return "INVALID_MONTH";
        }

        int maxProfit = -2000000000;
        String bestcom = "";

        // check commodities
        for (int i = 0; i < 5; i++) {
            int sum = 0;

            // sum profits for 28 days
            for (int j = 0; j < 28; j++) {
                sum = sum + data[month][j][i];
            }

            // update max profit
            if (sum > maxProfit) {
                maxProfit = sum;
                // get name directly from the array
                bestcom = commodities[i];
            }
        }

        return bestcom + " " + maxProfit;
    }



    public static int totalProfitOnDay(int month, int day) {
        // [month(input)][compare all days with for loop][sum all commodities one by one with for loop]
            if (month < 0 || month >= 12) {
                return -99999;
            }

            if (day < 1 || day > 28) {
                return -99999;}
            int d = day - 1;
            int t = 0;

            // sum profits for 5 coms
            for (int i = 0; i < 5; i++) {
                t = t + data[month][d][i];
            }
            return t;
        }



    public static int commodityProfitInRange(String commodity, int from, int to) {
        int c = -1;

        //comm index
        for (int i = 0; i < 5; i++) {
            if (commodities[i].equals(commodity)) {
                c = i;
                break;
            }
        }

        if (c == -1) {
            return 0;
        }

        int t = 0;

        // checkc all months
        for (int m = 0; m < 12; m++) {
            // Loop from start day to end day
            for (int d = from - 1; d < to; d++) {
                t = t + data[m][d][c];
            }
        }

        return t;
    }

    public static int bestDayOfMonth(int month) {
        // [check month][loop all days 0-27][inner loop: sum all 5 commodities][save the day with max profit]
        return 1234;
    }

    public static String bestMonthForCommodity(String comm) {
        return "DUMMY";
    }

    public static int consecutiveLossDays(String comm) {
        // [get index][loop all months and days][if profit < 0 count++ else count=0][find max]
        return 1234;
    }

    public static int daysAboveThreshold(String comm, int threshold) {
        // [check all months][check all days][if comm > threshold count++]
        return 1234;
    }

    public static int biggestDailySwing(int month) {
        return 1234;
    }

    public static String compareTwoCommodities(String c1, String c2) {
        // [check all months][check all days][sum1= sum of c1 , sum2= sum of c2 then compare sum1 and sum2
        return "DUMMY is better by 1234";
    }

    public static String bestWeekOfMonth(int month) {
        //[get month][compare sum of days like [0-7],[8-13]] [sum all commodities]
        return "DUMMY";
    }

    public static void main(String[] args) {
        loadData();
        System.out.println("Data loaded – ready for queries");
    }
}





