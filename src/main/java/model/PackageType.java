package model;

public interface PackageType {
    double calculateBill(Double bill);
    void checkQuota(int numberofPost, double bill);

}
