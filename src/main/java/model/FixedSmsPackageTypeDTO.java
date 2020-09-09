package model;

public class FixedSmsPackageTypeDTO extends ChannelDTO {
    private String phone;

    public FixedSmsPackageTypeDTO(String phone, String content){
        super(content);
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
