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
    private Integer phone;

    @NotNull
    @Size(min=3, max=25)
    private String login;

    @NotNull
    @Size(min = 3, max=35)
    private String password;

    @NotNull
    private String isActive;

    @NotNull
    private String role;
}
