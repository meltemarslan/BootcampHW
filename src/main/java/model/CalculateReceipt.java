package model;

public class CalculateReceipt {
    public static Double calculateBill(Sender sender, Double bill){

        return sender.getPackageType().calculateBill(bill);
    }
}


