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

import java.util.ArrayList;

public class SFFolderTemplateItem extends SFODataObject {

    @SerializedName("Name")
    private String Name;
    @SerializedName("Description")
    private String Description;
    @SerializedName("Items")
    private ArrayList<SFFolderTemplateItem> Items;

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public ArrayList<SFFolderTemplateItem> getItems() {
        return this.Items;
    }

    public void setItems(ArrayList<SFFolderTemplateItem> items) {
        this.Items = items;
    }

}