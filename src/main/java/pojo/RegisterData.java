package pojo;

public class RegisterData {

    private String firstName;
    private String lastName;
    private String eMail;
    private String telephone;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RegisterData(String firstName, String lastName, String eMail, String telephone, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.telephone = telephone;
        this.password = password;
    }
}
