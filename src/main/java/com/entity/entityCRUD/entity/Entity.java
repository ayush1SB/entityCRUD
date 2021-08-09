package com.entity.entityCRUD.entity;

import javax.persistence.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@javax.persistence.Entity
public class Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;
    private String companyName,gstNo,panNo,cin,contactNo;
    private String country,address,city,state,zipCode,countryCode,locationContactNo;
    private String billingContactNo,emailId,billingMobileNo;

    public Entity() {
    }

    public Entity(int entityId, String companyName, String gstNo, String panNo, String cin, String contactNo, String country, String address, String city, String state, String zipCode, String countryCode, String locationContactNo, String billingContactNo, String emailId, String billingMobileNo) {
        this.entityId = entityId;
        this.companyName = companyName;
        this.gstNo = gstNo;
        this.panNo = panNo;
        this.cin = cin;
        this.contactNo = contactNo;
        this.country = country;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.countryCode = countryCode;
        this.locationContactNo = locationContactNo;
        this.billingContactNo = billingContactNo;
        this.emailId = emailId;
        this.billingMobileNo = billingMobileNo;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLocationContactNo() {
        return locationContactNo;
    }

    public void setLocationContactNo(String locationContactNo) {
        this.locationContactNo = locationContactNo;
    }

    public String getBillingContactNo() {
        return billingContactNo;
    }

    public void setBillingContactNo(String billingContactNo) {
        this.billingContactNo = billingContactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getBillingMobileNo() {
        return billingMobileNo;
    }

    public void setBillingMobileNo(String billingMobileNo) {
        this.billingMobileNo = billingMobileNo;
    }
}
