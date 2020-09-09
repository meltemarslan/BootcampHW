package model;

public class FixedMailPackageType implements PackageType, Channel {

    private FixedMailPackageTypeDTO fixedEmail;

    public FixedMailPackageType(FixedMailPackageTypeDTO fixedEmail){
        this.fixedEmail = fixedEmail;
    }
    @Override
    public double calculateBill(Double bill){
        return bill + 10;
    }
    @Override
    public void send(){
        System.out.println("Fixed Mail Sent");
        System.out.println(this.fixedEmail.getContent());
    }
    @Override
    public void checkQuota(int numberofPost, double bill){
        if(numberofPost > 0){
            bill +=10;
        }
        if(numberofPost  > 1000){
            numberofPost=numberofPost%1000;
            //bill +=20;
            //incrementMonthCountByOne();
            // extraChargeMail(numberOfFlexibleMail,bill);
        }
    }
}



