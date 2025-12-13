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

    // Veri yapısı (12 Ay, 28 Gün, 5 Emtia)
    public static int[][][] data = new int[MONTHS][DAYS][COMMS];


    // ======== REQUIRED METHOD LOAD DATA (Students fill this) ========
    public static void loadData() {

           }

    // ======== 10 REQUIRED METHODS (Students fill these) ========

    public static String mostProfitableCommodityInMonth(int month) {
        int mostProfVal = data[month][i-28][j-4]



        //[month][day][(sum of all profits in for loop)]

        return "DUMMY";
    }

    public static int totalProfitOnDay(int month, int day) {
        // [month(input)][compare all days with for loop][sum all commodities one by one with for loop]
        return 1234;
    }

    public static int commodityProfitInRange(String commodity, int from, int to) {
        // Check all 12 months. Inside, loop from 'fromDay' to 'toDay' and add profits.
        return 1234;
    }

    public static int bestDayOfMonth(int month) {
        // [check month][loop all days 0-27][inner loop: sum all 5 commodities][save the day with max profit]
        return 1234;
    }

    public static String bestMonthForCommodity(String comm) {
        // Loop 0 to 11 (months). Sum all 28 days for the specific commodity.
        // Find the best month name.
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
