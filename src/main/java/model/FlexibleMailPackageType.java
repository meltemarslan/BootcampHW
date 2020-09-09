package model;

import exception.LimitExceededException;

public class FlexibleMailPackageType implements PackageType, Channel{
    private FlexibleMailPackageTypeDTO flexibleEmail;
    public FlexibleMailPackageType(FlexibleMailPackageTypeDTO flexibleEmail){
        this.flexibleEmail = flexibleEmail;
    }

    @Override
    public double calculateBill(Double bill){
        return bill + 7.5;
    }
    public double extraChargeMail(int extraSmsCount, double bill){
        return bill + (extraSmsCount*0.03);
    }
    @Override
    public void send(){
        System.out.println("Flexible Mail Sent");
        System.out.println(this.flexibleEmail.getContent());

    }
    @Override
    public void checkQuota(int numberofPost, double bill){
        if(numberofPost > 0){
            bill +=7.5;
        }
        if(numberofPost  > 2000){
            numberofPost=numberofPost%2000;
            //bill +=20;
            //incrementMonthCountByOne();
            // extraChargeMail(numberOfFlexibleMail,bill);
        }
    }
}













