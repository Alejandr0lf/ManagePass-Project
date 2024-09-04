package model.objects;

public class UserAdmin extends User {

    private String AdminName;
    private UserAdmin Insance;

    private UserAdmin(String password, String adminName) {
        super(password);
        this.AdminName = adminName;
    }

    public UserAdmin getInstance(String password, String adminName){
        if(this.Insance == null){
            return new UserAdmin(password, adminName);
        }else{
            return this.Insance;
        }
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    
}
