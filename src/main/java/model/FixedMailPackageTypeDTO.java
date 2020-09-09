package model;

public class FixedMailPackageTypeDTO extends ChannelDTO {
    private String email;

    public FixedMailPackageTypeDTO(String email, String content){
        super(content);
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



