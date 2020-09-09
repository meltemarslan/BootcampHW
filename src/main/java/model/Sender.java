package model;
import exception.LimitExceededException;

public class Sender {
    protected int id;
    protected String email;
    protected String phone;
    private PackageType PackageType;
    private int numberOfFixedSms;
    private int numberOfFlexibleSms;
    private int numberOfFixedMail;
    private int numberOfFlexibleMail;
    private double bill;

    protected Language language;
    int notPaidMonthCount;

    public Sender(int id, String name, String email, String phone, PackageType PackageType, int numberOfFixedSms, int numberOfFlexibleSms,int numberOfFixedMail, int numberOfFlexibleMail, double bill, Language language, int notPaidMonthCount) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.PackageType = PackageType;

        this.numberOfFixedSms =numberOfFixedSms ;
        this.numberOfFlexibleSms=numberOfFlexibleSms;
        this.numberOfFixedMail=numberOfFixedMail;
        this.numberOfFlexibleMail=numberOfFlexibleMail;

        this.bill = 0.0;
        this.language =language;
        this.notPaidMonthCount = notPaidMonthCount;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public model.PackageType getPackageType() {
        return PackageType;
    }

    public void setPackageType(model.PackageType packageType) {
        PackageType = packageType;
    }
    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
    public void incrementNumberOfFixedSmsSentByOne() {
        this.numberOfFixedSms += 1;
    }
    public void incrementNumberOfFlexibleSmsSentByOne() {
        this.numberOfFlexibleSms += 1;
    }
    public void incrementNumberOfFixedMailSentByOne() {
        this.numberOfFixedMail += 1;
    }
    public void incrementNumberOfFlexibleMailSentByOne() {
        this.numberOfFlexibleMail += 1;
    }

    public void sendFixedMail(FixedMailPackageType mail){
        if(notPaidMonthCount == 2) {
            throw new LimitExceededException(language.returnMessage());
        }
            mail.checkQuota(numberOfFixedMail, bill);
            mail.send();
            //numberOfFixedMail++;
            incrementNumberOfFixedMailSentByOne();
           // System.out.println(monthCount);
            //System.out.println(numberOfFixedMail);
    }

    public void sendFixedSms(FixedSmsPackageType sms){
        if(notPaidMonthCount == 2) {
            throw new LimitExceededException(language.returnMessage());
        }
        sms.checkQuota(numberOfFixedSms, bill);
        sms.send();
        //numberOfFixedMail++;

        incrementNumberOfFixedSmsSentByOne();
        // System.out.println(monthCount);
        //System.out.println(numberOfFixedMail);
    }

    public void sendFlexibleMail(FlexibleMailPackageType mail){
        if(notPaidMonthCount == 2) {
            throw new LimitExceededException(language.returnMessage());
        }
        mail.checkQuota(numberOfFlexibleMail, bill);
        mail.send();
        bill = mail.extraChargeMail(numberOfFlexibleMail,bill);
        incrementNumberOfFlexibleMailSentByOne();
        // System.out.println(monthCount);
        //System.out.println(bill);
    }
    public void sendFlexibleSms(FlexibleSmsPackageType sms){
        if(notPaidMonthCount == 2) {
            throw new LimitExceededException(language.returnMessage());
        }
        sms.checkQuota(numberOfFlexibleSms, bill);
        sms.send();
        bill = sms.extraChargeSms(numberOfFlexibleSms,bill);
        incrementNumberOfFlexibleSmsSentByOne();
        // System.out.println(monthCount);
        //System.out.println(bill);
    }












}






