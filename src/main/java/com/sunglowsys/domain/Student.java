package com.sunglowsys.domain;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
        private Long id;
        private String firstName;
        private String lastName;
        private String fatherName;
        private String email;
        private String mobile;

    public void getId() {
        System.out.println("Id =" + id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void getFirstName() {
        System.out.println("First Name="+ firstName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getLastName() {
        System.out.println("Last Name=" + lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getFatherName() {
        System.out.println("Father Name=" + fatherName);
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void getEmail() {
        System.out.println("Email=" + email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getMobile() {
        System.out.println("Mobile=" + mobile);
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(fatherName, student.fatherName) && Objects.equals(email, student.email) && Objects.equals(mobile, student.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, fatherName, email, mobile);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
