package model;

public class Main {
    public static void main(String[] args) {

        //Customer customer1 = new Customer(1L, "name-1", "surname-1", new StandardMembershipType());
        Sender sender1 = new Sender (1, "Company1", "hello1@gmail.com", "123456789", new FixedMailPackageType(new FixedMailPackageTypeDTO("987654321", "yeni deneme!")), 2000,2000,1005,2000, 0, new English(), 1);
        sender1.sendFixedMail(new FixedMailPackageType(new FixedMailPackageTypeDTO("12345678", "Hello!")));

        Sender sender2 = new Sender (2, "Company2", "hello2@gmail.com", "123456789", new FlexibleMailPackageType(new FlexibleMailPackageTypeDTO("hello2@gmail.com", "Flexible mail package trial 1!")), 0,0,1005,0, 0, new Turkish(), 2);
        sender2.sendFlexibleMail(new FlexibleMailPackageType(new FlexibleMailPackageTypeDTO("hello2@gmail.com", "Flexible mail package trial 1!")));

       

    }
}

