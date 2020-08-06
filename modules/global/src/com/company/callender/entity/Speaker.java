package com.company.callender.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "CALLENDER_SPEAKER", indexes = {
        @Index(name = "IDX_CALLENDER_SPEAKER", columnList = "FIRST_NAME, LAST_NAME")
})
@Entity(name = "callender_Speaker")
@NamePattern("%s|firstName,lastName")
public class Speaker extends StandardEntity {
    private static final long serialVersionUID = 8284879994082854793L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @NotNull
    @Column(name = "EMAIL", nullable = false, length = 1024)
    @Email(message = "Email is not valid value")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}