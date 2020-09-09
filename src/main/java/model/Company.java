package model;

public class Company extends Sender{

    public Company(int id, String name, String email, String phone, PackageType PackageType, int numberOfFixedSms, int numberOfFlexibleSms,int numberOfFixedMail, int numberOfFlexibleMail, double bill, Language language, int monthCount) {
        super(id, name,email, phone, PackageType, numberOfFixedSms,numberOfFlexibleSms,numberOfFixedMail, numberOfFlexibleMail, bill, language, monthCount);
    }
}

