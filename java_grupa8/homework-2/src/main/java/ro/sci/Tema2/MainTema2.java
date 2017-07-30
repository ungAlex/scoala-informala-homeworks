package main.java.ro.sci.Tema2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Created by Alex on 27.07.2017.
 */
public class MainTema2 {
    public static void main(String[] args) {

        SalesReprezentative srAle = new SalesReprezentative();
        SalesReprezentative srGeo = new SalesReprezentative();
        SalesReprezentative srIon = new SalesReprezentative();
        SalesReprezentative srBea = new SalesReprezentative();

        int valueAle = srAle.calcGeneratedRevenue(10, 100);
        int valueGeo = srGeo.calcGeneratedRevenue(20, 50);
        int valueIon = srIon.calcGeneratedRevenue(45, 5);
        int valueBea = srBea.calcGeneratedRevenue(78, 7);

        int sortSalesRep[] = {valueAle, valueBea, valueGeo, valueIon};
        for (int i = 0; i < sortSalesRep.length; i++) {
            System.out.print(sortSalesRep[i] + " ");
        }
        System.out.println(" Sorted Array: ");
        int[] sortedSalesRep = BubbleSort(sortSalesRep);
        for (int i = 0; i < sortedSalesRep.length; i++) {
            System.out.print(sortedSalesRep[i] + " ");
        }


    }

    public static int[] BubbleSort(int[] num) {
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;                for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1])
                {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return num;
    }
}
