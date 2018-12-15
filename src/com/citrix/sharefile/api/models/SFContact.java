// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2017 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class SFContact extends SFPrincipal {

    @SerializedName("User")
    private SFUser User;
    @SerializedName("FirstName")
    private String FirstName;
    @SerializedName("LastName")
    private String LastName;
    @SerializedName("Company")
    private String Company;
    @SerializedName("EmailMedium")
    private String EmailMedium;
    @SerializedName("EmailShort")
    private String EmailShort;
    @SerializedName("IsConfirmed")
    private Boolean IsConfirmed;
    @SerializedName("IsDisabled")
    private Boolean IsDisabled;
    @SerializedName("LastAnyLogin")
    private Date LastAnyLogin;
    @SerializedName("Count")
    private Integer Count;
    @SerializedName("CreatedDate")
    private Date CreatedDate;

    public SFUser getUser() {
        return this.User;
    }

    public void setUser(SFUser user) {
        this.User = user;
    }

    /**
     * FirstName
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * FirstName
     */
    public void setFirstName(String firstname) {
        this.FirstName = firstname;
    }

    /**
     * LastName
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * LastName
     */
    public void setLastName(String lastname) {
        this.LastName = lastname;
    }

    /**
     * Company
     */
    public String getCompany() {
        return this.Company;
    }

    /**
     * Company
     */
    public void setCompany(String company) {
        this.Company = company;
    }

    /**
     * First 40 characters of the e-mail address
     */
    public String getEmailMedium() {
        return this.EmailMedium;
    }

    /**
     * First 40 characters of the e-mail address
     */
    public void setEmailMedium(String emailmedium) {
        this.EmailMedium = emailmedium;
    }

    /**
     * First 20 characters of the e-mail address
     */
    public String getEmailShort() {
        return this.EmailShort;
    }

    /**
     * First 20 characters of the e-mail address
     */
    public void setEmailShort(String emailshort) {
        this.EmailShort = emailshort;
    }

    public Boolean getIsConfirmed() {
        return this.IsConfirmed;
    }

    public void setIsConfirmed(Boolean isconfirmed) {
        this.IsConfirmed = isconfirmed;
    }

    /**
     * Whether the contact is disabled or not.
     */
    public Boolean getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Whether the contact is disabled or not.
     */
    public void setIsDisabled(Boolean isdisabled) {
        this.IsDisabled = isdisabled;
    }

    /**
     * Last login time for the user.
     */
    public Date getLastAnyLogin() {
        return this.LastAnyLogin;
    }

    /**
     * Last login time for the user.
     */
    public void setLastAnyLogin(Date lastanylogin) {
        this.LastAnyLogin = lastanylogin;
    }

    /**
     * Number of members in a distribution group. Will only be filled for distribution group.
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * Number of members in a distribution group. Will only be filled for distribution group.
     */
    public void setCount(Integer count) {
        this.Count = count;
    }

    /**
     * Date this user was created
     */
    public Date getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Date this user was created
     */
    public void setCreatedDate(Date createddate) {
        this.CreatedDate = createddate;
    }

}