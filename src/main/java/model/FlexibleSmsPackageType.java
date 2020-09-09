package model;

public class FlexibleSmsPackageType implements PackageType,Channel {
    @Override
    public double calculateBill(Double bill){
        return bill + 30;
    }
    public double extraChargeSms(int extraSmsCount, double bill){
        return bill + (extraSmsCount*0.10);
    }
    @Override
    public void send(){
        System.out.println("Flexible SMS Sent");
    }
    @Override
    public void checkQuota(int numberofPost, double bill){
        if(numberofPost > 0){
            bill +=30;
        }
        if(numberofPost  > 2000){
            numberofPost=numberofPost%2000;
            //bill +=20;
            //incrementMonthCountByOne();
            // extraChargeMail(numberOfFlexibleMail,bill);
        }
    }
}

