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

package com.citrix.sharefile.api.entities;

import com.citrix.sharefile.api.SFApiQuery;
import com.citrix.sharefile.api.exceptions.InvalidOrMissingParameterException;
import com.citrix.sharefile.api.interfaces.ISFApiClient;
import com.citrix.sharefile.api.interfaces.ISFQuery;
import com.citrix.sharefile.api.models.SFODataFeed;
import com.citrix.sharefile.api.models.SFPolicy;
import com.citrix.sharefile.api.models.SFUserPolicy;

import java.net.URI;
import java.util.ArrayList;

public class SFPoliciesEntity extends SFEntitiesBase {
    public SFPoliciesEntity(ISFApiClient client) {
        super(client);
    }

    /**
     * Get List of Account Policies
     * The Policies endpoint returns the list of policies that have been defined for current account.
     *
     * @return List of account policies
     */
    public ISFQuery<SFODataFeed<SFPolicy>> get() {

        SFApiQuery<SFODataFeed<SFPolicy>> sfApiQuery = new SFApiQuery<SFODataFeed<SFPolicy>>(this.client);
        sfApiQuery.setFrom("Policies");
        sfApiQuery.setHttpMethod("GET");
        return sfApiQuery;
    }

    /**
     * Get Policy
     * Returns information for a specific Policy.
     *
     * @param url
     * @return A single Policy
     */
    public ISFQuery<SFPolicy> get(URI url) throws InvalidOrMissingParameterException {
        if (url == null) {
            throw new InvalidOrMissingParameterException("url");
        }

        SFApiQuery<SFPolicy> sfApiQuery = new SFApiQuery<SFPolicy>(this.client);
        sfApiQuery.setFrom("Policies");
        sfApiQuery.addIds(url);
        sfApiQuery.setHttpMethod("GET");
        return sfApiQuery;
    }

    /**
     * Set user Policy
     * [{
     * "Active": true,
     * "Policy": {
     * "Id": "123"
     * }
     * },
     * {
     * "Active": false,
     * "Policy": {
     * "Id": "456"
     * }
     * }]
     * Replace all policies associated with user
     * Leaving any category out will effectively disable PBA for that category. At most one policy per category is allowed.
     *
     * @param url
     * @return Returns user policies
     */
    public ISFQuery<SFODataFeed<SFUserPolicy>> patchByUser(URI url, ArrayList<SFUserPolicy> userPolicies) throws InvalidOrMissingParameterException {
        if (url == null) {
            throw new InvalidOrMissingParameterException("url");
        }
        if (userPolicies == null) {
            throw new InvalidOrMissingParameterException("userPolicies");
        }

        SFApiQuery<SFODataFeed<SFUserPolicy>> sfApiQuery = new SFApiQuery<SFODataFeed<SFUserPolicy>>(this.client);
        sfApiQuery.setFrom("Users");
        sfApiQuery.setAction("Policies");
        sfApiQuery.addIds(url);
        sfApiQuery.setBody(userPolicies);
        sfApiQuery.setHttpMethod("PUT");
        return sfApiQuery;
    }

    /**
     * Create User Policy
     * {
     * "Active": true,
     * "Policy": {
     * "Id": "123"
     * }
     * }
     * Assigns a Policy to a user
     *
     * @param url
     * @param policy
     * @return Returns newly assigned Policy
     */
    public ISFQuery<SFUserPolicy> createByUser(URI url, SFUserPolicy policy) throws InvalidOrMissingParameterException {
        if (url == null) {
            throw new InvalidOrMissingParameterException("url");
        }
        if (policy == null) {
            throw new InvalidOrMissingParameterException("policy");
        }

        SFApiQuery<SFUserPolicy> sfApiQuery = new SFApiQuery<SFUserPolicy>(this.client);
        sfApiQuery.setFrom("Users");
        sfApiQuery.setAction("Policies");
        sfApiQuery.addIds(url);
        sfApiQuery.setBody(policy);
        sfApiQuery.setHttpMethod("POST");
        return sfApiQuery;
    }

    /**
     * Delete User Policies
     * Remove user from policy based admin
     *
     * @param url
     */
    public ISFQuery deleteByUser(URI url) throws InvalidOrMissingParameterException {
        if (url == null) {
            throw new InvalidOrMissingParameterException("url");
        }

        SFApiQuery sfApiQuery = new SFApiQuery(this.client);
        sfApiQuery.setFrom("Users");
        sfApiQuery.setAction("Policies");
        sfApiQuery.addIds(url);
        sfApiQuery.setHttpMethod("DELETE");
        return sfApiQuery;
    }

    public ISFQuery deleteByUser(URI url, String id) throws InvalidOrMissingParameterException {
        if (url == null) {
            throw new InvalidOrMissingParameterException("url");
        }
        if (id == null) {
            throw new InvalidOrMissingParameterException("id");
        }

        SFApiQuery sfApiQuery = new SFApiQuery(this.client);
        sfApiQuery.setFrom("Users");
        sfApiQuery.setAction("Policies");
        sfApiQuery.addIds(url);
        sfApiQuery.addActionIds(id);
        sfApiQuery.setHttpMethod("DELETE");
        return sfApiQuery;
    }

    /**
     * Update a single UserPolicy
     * {
     * "Active": false
     * }
     * Updates a single user Policy. Currently this only allows an update to the Active flag.
     *
     * @param url
     */
    public ISFQuery<SFUserPolicy> updateByUser(URI url, String id, SFUserPolicy updatedPolicy) throws InvalidOrMissingParameterException {
        if (url == null) {
            throw new InvalidOrMissingParameterException("url");
        }
        if (id == null) {
            throw new InvalidOrMissingParameterException("id");
        }
        if (updatedPolicy == null) {
            throw new InvalidOrMissingParameterException("updatedPolicy");
        }

        SFApiQuery<SFUserPolicy> sfApiQuery = new SFApiQuery<SFUserPolicy>(this.client);
        sfApiQuery.setFrom("Users");
        sfApiQuery.setAction("Policies");
        sfApiQuery.addIds(url);
        sfApiQuery.addActionIds(id);
        sfApiQuery.setBody(updatedPolicy);
        sfApiQuery.setHttpMethod("PATCH");
        return sfApiQuery;
    }

}

