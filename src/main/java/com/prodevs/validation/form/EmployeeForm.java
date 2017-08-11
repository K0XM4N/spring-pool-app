package com.prodevs.validation.form;

import com.prodevs.validation.annotation.Password;
import com.prodevs.validation.annotation.Phone;
import com.prodevs.validation.annotation.ReTypedPassword;
import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Krzysztof on 2017-06-18.
 */
@Component
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
    @Password
    private String password;

    @NotNull
    @ReTypedPassword
    private String rePassword;

    @NotNull
    @Size(min = 2, message = "Choose account status from dropdown")
    private String isActive;

    @NotNull
    @Size(min = 2, message = "Choose role from dropdown")
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
