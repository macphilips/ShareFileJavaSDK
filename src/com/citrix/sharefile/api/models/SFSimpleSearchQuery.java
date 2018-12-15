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

public class SFSimpleSearchQuery extends SFODataObject {

    @SerializedName("Query")
    private SFSimpleQuery Query;
    @SerializedName("Paging")
    private SFQueryPaging Paging;
    @SerializedName("Sort")
    private SFQuerySorting Sort;
    @SerializedName("TimeoutInSeconds")
    private Integer TimeoutInSeconds;

    /**
     * Information about the query to run
     */
    public SFSimpleQuery getQuery() {
        return this.Query;
    }

    /**
     * Information about the query to run
     */
    public void setQuery(SFSimpleQuery query) {
        this.Query = query;
    }

    /**
     * Paging info about the search results
     */
    public SFQueryPaging getPaging() {
        return this.Paging;
    }

    /**
     * Paging info about the search results
     */
    public void setPaging(SFQueryPaging paging) {
        this.Paging = paging;
    }

    /**
     * How the search results should be sorted
     */
    public SFQuerySorting getSort() {
        return this.Sort;
    }

    /**
     * How the search results should be sorted
     */
    public void setSort(SFQuerySorting sort) {
        this.Sort = sort;
    }

    /**
     * Timeout for the search request in seconds
     */
    public Integer getTimeoutInSeconds() {
        return this.TimeoutInSeconds;
    }

    /**
     * Timeout for the search request in seconds
     */
    public void setTimeoutInSeconds(Integer timeoutinseconds) {
        this.TimeoutInSeconds = timeoutinseconds;
    }

}