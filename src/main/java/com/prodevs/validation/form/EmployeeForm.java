package com.prodevs.validation.form;

import com.prodevs.validation.annotation.Phone;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Krzysztof on 2017-06-18.
 */
public class EmployeeForm {

    @NotNull
    @Size(min = 3, max = 35)
    private String firstName;

    @NotNull
    @Size(min = 3, max = 35)
    private String lastName;

    @NotNull
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$")
    private String eMail;

    @Phone()
    private String phone;

    @NotNull
    @Size(min=3, max=25)
    private String login;

    @NotNull
    @Size(min = 3, max=35)
    private String password;

    @NotNull
    @Size(min = 3, max=35)
    private String rePassword;

    @NotNull
    @Size(min = 3)
    private String isActive;

    @NotNull
    @Size(min = 3)
    private String role;

    public EmployeeForm(){

    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
