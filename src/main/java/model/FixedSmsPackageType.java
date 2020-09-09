package model;

public class FixedSmsPackageType implements PackageType,Channel {
    @Override

    public double calculateBill(Double bill){
        return bill + 20;
    }
    @Override
    public void send(){
        System.out.println("Fixed SMS Sent");
    }
    @Override
    public void checkQuota(int numberofPost, double bill){
        if(numberofPost > 0){
            bill +=20;
        }
        if(numberofPost  > 1000){
            numberofPost=numberofPost%1000;
            //bill +=20;
            //incrementMonthCountByOne();
            // extraChargeMail(numberOfFlexibleMail,bill);
        }
    }
}


