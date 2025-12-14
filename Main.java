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
                // Get name directly from the array
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
            // loop from start day to end day
            for (int d = from - 1; d < to; d++) {
                t = t + data[m][d][c];
            }
        }

        return t;
    }



        public static int bestDayOfMonth(int month) {

            if (month < 0 || month >= 12) {
                return -1;
            }

            int max = -2000000000;
            int bestDay = -1;

            for (int d = 0; d < 28; d++) {
                int sum = 0;

                // sum al coms
                for (int i = 0; i < 5; i++) {
                    sum = sum + data[month][d][i];
                }

                if (sum > max) {
                    max = sum;
                    bestDay = d;
                }
            }

            return bestDay + 1;
        }


    public static String bestMonthForCommodity(String comm) {
        int c = -1;

        for (int i = 0; i < 5; i++) {
            if (commodities[i].equals(comm)) {
                c = i;
                break;
            }
        }

        if (c == -1) {
            return "INVALID";
        }
        int max = -2000000000;
        int bestM = 0;

        // months
        for (int m = 0; m < 12; m++) {
            int total = 0;

            // sum days
            for (int d = 0; d < 28; d++) {
                total = total + data[m][d][c];
            }

            if (total > max) {
                max = total;
                bestM = m;
            }
        }
        return months[bestM];
    }

    public static int consecutiveLossDays(String comm) {
        // [get index][loop all months and days][if profit < 0 count++ else count=0][find max]
        return 1234;
    }

    public static int daysAboveThreshold(String comm, int threshold) {
        int c = -1;

        // Find commodity index
        for (int i = 0; i < 5; i++) {
            if (commodities[i].equals(comm)) {
                c = i;
                break;
            }
        }
        if (c == -1) {
            return 0;
        }
        int count = 0;

        // month loop
        for (int m = 0; m < 12; m++) {
            // check days
            for (int d = 0; d < 28; d++) {
                if (data[m][d][c] > threshold) {
                    count = count + 1;
                }
            }
        }
        return count;
    }

    public static int biggestDailySwing(int month) {
        return 1234;
    }

    public static String compareTwoCommodities(String c1, String c2) {
        int com1 = -1;
        int com2 = -1;

        // decide com1
        for (int i = 0; i < 5; i++) {
            if (commodities[i].equals(c1)) {
                com1 = i;
            }
        }

        // decide com2
        for (int i = 0; i < 5; i++) {
            if (commodities[i].equals(c2)) {
                com2 = i;
            }
        }

        if (com1 == -1 || com2 == -1) {
            return "INVALID";
        }

        int sum1 = 0;
        int sum2 = 0;

        // sum
        for (int m = 0; m < 12; m++) {
            for (int d = 0; d < 28; d++) {
                sum1 = sum1 + data[m][d][com1];
                sum2 = sum2 + data[m][d][com2];
            }
        }

        if (sum1 > sum2) {
            int diff = sum1 - sum2;
            return c1 + " is better by " + diff;
        } else {
            int diff = sum2 - sum1;
            return c2 + " is better by " + diff;
        }
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
