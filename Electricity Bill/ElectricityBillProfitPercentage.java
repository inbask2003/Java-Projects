 import java.util.*;

public class ElectricityBillProfitPercentage 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String months[] = {"Jan-Feb","Mar-Apr","May-Jun","Jul-Aug","Sep-Oct","Nov-Dec"};
        int oneMonthUnit[] = new int[12];
        int twoMonthUnit[] = new int[6];
        int totalYearUnit = 0;
        int profitAmount = 0,profitPercentage = 0;

        for(int i = 0;i < 6;i++)
        {
            System.out.println("EB unit for "+months[i]+" Month :");
            twoMonthUnit[i] = input.nextInt();
            totalYearUnit += twoMonthUnit[i];
        }

        int twoMonthBillCalculation = BillCalculation(twoMonthUnit);
        System.out.println("Your 1 year EB bill(2 month) :"+twoMonthBillCalculation);

        // one month unit from one year unit
        int avgOneMonthUnit = totalYearUnit / 12;

        for(int i = 0;i < oneMonthUnit.length;i++)
        {
            oneMonthUnit[i] = avgOneMonthUnit;
        }

        int oneMonthBillCalculation = BillCalculation(oneMonthUnit);
        System.out.println("Your 1 year EB bill(1 month) :"+ oneMonthBillCalculation);

        profitAmount = twoMonthBillCalculation - oneMonthBillCalculation;
        System.out.println("Total EB bill profit Amount = "+profitAmount);

        // Profit Percentage = (profit amount / total amount) / 100
        profitPercentage = profitAmount/(twoMonthBillCalculation/100);
        System.out.println("Total EB bill profit Percentage = "+profitPercentage);

    }

    static int BillCalculation(int monthBill[])
    {
        int monthBillAmount = 0;
        for(int i = 0;i < monthBill.length;i++)
        {
            if(monthBill[i] >= 1 && monthBill[i] <= 99)
            {
                monthBillAmount += 0; 
            }
            else if(monthBill[i] >= 100 && monthBill[i] <= 199)
            {
                monthBillAmount += monthBill[i] * 2;
            }
            else if(monthBill[i] >= 200 && monthBill[i] <= 299)
            {
                monthBillAmount += monthBill[i] * 3;
            }
            else if(monthBill[i] >= 300 && monthBill[i] <= 399)
            {
                monthBillAmount += monthBill[i] * 4;
            }
            else if(monthBill[i] >= 400 && monthBill[i] <= 499)
            {
                monthBillAmount += monthBill[i] * 5;
            }
            else if(monthBill[i] >= 500 && monthBill[i] <= 999)
            {
                monthBillAmount += monthBill[i] * 7;
            }
            else
            {
                monthBillAmount += monthBill[i] * 10;
            }
        }
        return monthBillAmount;
    }
}
