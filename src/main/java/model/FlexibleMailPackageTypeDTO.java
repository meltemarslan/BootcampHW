package model;

public class FlexibleMailPackageTypeDTO extends ChannelDTO {
    private String flexibleEmail;

    public FlexibleMailPackageTypeDTO(String flexibleEmail, String content){
        super(content);
        this.flexibleEmail = flexibleEmail;
    }
    public String getEmail() {
        return flexibleEmail;
    }

    public void setEmail(String flexibleEmail) {
        this.flexibleEmail = flexibleEmail;
    }
}
