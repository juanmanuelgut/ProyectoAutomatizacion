package pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterData { //autor:  Juan Gutiérrez

    private String firstName;
    private String lastName;
    private String email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        this.email = eMail;
        this.telephone = telephone;
        this.password = password;
    }

    public String makeEmailUnique(String email){
        String user = email.substring(0,email.indexOf('@')-1);
        String domain = email.substring(email.indexOf('@'));
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String uniqueEmail = user + timeStamp + domain;
        return uniqueEmail;
    }
}
