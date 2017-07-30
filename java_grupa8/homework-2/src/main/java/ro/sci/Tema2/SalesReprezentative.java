package main.java.ro.sci.Tema2;

/**
 * Created by Alex on 27.07.2017.
 */
public class SalesReprezentative {
    int numberOfSales;
    int sale;
    String name;

    /**
     * calculate generated revenue for a sales reprezenative
     * @param numberOfSales
     * @param sale
     * @return
     */

    public int calcGeneratedRevenue(int numberOfSales , int sale){
        int generatedRevenue = numberOfSales * sale;
        return generatedRevenue;
    }


}
