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

public class SFSalesTaxQuote extends SFODataObject {

    @SerializedName("TaxRate")
    private Double TaxRate;
    @SerializedName("TotalTax")
    private Double TotalTax;
    @SerializedName("ErrorMessage")
    private String ErrorMessage;

    /**
     * Tax rate used to calculate the Total Tax, in decimal form, e.g, 7% is 0.07
     */
    public Double getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Tax rate used to calculate the Total Tax, in decimal form, e.g, 7% is 0.07
     */
    public void setTaxRate(Double taxrate) {
        this.TaxRate = taxrate;
    }

    /**
     * Total Tax quoted, in $US
     */
    public Double getTotalTax() {
        return this.TotalTax;
    }

    /**
     * Total Tax quoted, in $US
     */
    public void setTotalTax(Double totaltax) {
        this.TotalTax = totaltax;
    }

    /**
     * If Tax could not be calculated, this property will provide a message
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * If Tax could not be calculated, this property will provide a message
     */
    public void setErrorMessage(String errormessage) {
        this.ErrorMessage = errormessage;
    }

}