package Fir.dto;


public class Admin
{
private String adminId;
private String adminName;
private String password;
private String email;
private long contact;


public Admin(){ 
}

    public Admin(String adminId, String adminName, String password, String email, long contact) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
        this.email = email;
        this.contact = contact;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public long getContact() {
        return contact;
    }

    public String getAdminName() {
        return adminName;
    }

    public String getAdminId() {
        return adminId;

    }

    
}