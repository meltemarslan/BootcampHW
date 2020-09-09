package model;

public class FlexibleSmsPackageTypeDTO extends ChannelDTO{
    private String flexibleSms;
    public FlexibleSmsPackageTypeDTO(String flexibleSms, String content){
        super(content);
        this.flexibleSms = flexibleSms;
    }
    public String getSms() {
        return flexibleSms;
    }
    public void setSms(String flexibleSms) {
        this.flexibleSms = flexibleSms;
    }
}


