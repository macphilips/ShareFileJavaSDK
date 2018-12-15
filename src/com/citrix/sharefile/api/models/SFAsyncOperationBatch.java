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

import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class SFAsyncOperationBatch extends SFODataObject {

    @SerializedName("SubjectType")
    private SFSafeEnum<SFAsyncOperationSubjectType> SubjectType;
    @SerializedName("Operation")
    private SFSafeEnum<SFAsyncOperationType> Operation;
    @SerializedName("State")
    private SFSafeEnum<SFAsyncOperationState> State;
    @SerializedName("StartDate")
    private Date StartDate;
    @SerializedName("Source")
    private SFItem Source;
    @SerializedName("Destination")
    private SFItem Destination;
    @SerializedName("SourceZone")
    private SFZone SourceZone;
    @SerializedName("DestinationZone")
    private SFZone DestinationZone;
    @SerializedName("InitiatedBy")
    private SFUser InitiatedBy;
    @SerializedName("TotalSizeInBytes")
    private Long TotalSizeInBytes;
    @SerializedName("ProcessedBytes")
    private Long ProcessedBytes;
    @SerializedName("TotalItemCount")
    private Long TotalItemCount;
    @SerializedName("ProcessedItemCount")
    private Long ProcessedItemCount;
    @SerializedName("FailedItemCount")
    private Long FailedItemCount;

    /**
     * Async operation subject type.
     */
    public SFSafeEnum<SFAsyncOperationSubjectType> getSubjectType() {
        return this.SubjectType;
    }

    /**
     * Async operation subject type.
     */
    public void setSubjectType(SFSafeEnum<SFAsyncOperationSubjectType> subjecttype) {
        this.SubjectType = subjecttype;
    }

    /**
     * Operation type.
     */
    public SFSafeEnum<SFAsyncOperationType> getOperation() {
        return this.Operation;
    }

    /**
     * Operation type.
     */
    public void setOperation(SFSafeEnum<SFAsyncOperationType> operation) {
        this.Operation = operation;
    }

    /**
     * Batch state. States 'Created' and 'Scheduled' indicate the operation is
     * in progress; States 'Success' and 'Failure' indicate the operation is finished.
     */
    public SFSafeEnum<SFAsyncOperationState> getState() {
        return this.State;
    }

    /**
     * Batch state. States 'Created' and 'Scheduled' indicate the operation is
     * in progress; States 'Success' and 'Failure' indicate the operation is finished.
     */
    public void setState(SFSafeEnum<SFAsyncOperationState> state) {
        this.State = state;
    }

    /**
     * Batch start date.
     */
    public Date getStartDate() {
        return this.StartDate;
    }

    /**
     * Batch start date.
     */
    public void setStartDate(Date startdate) {
        this.StartDate = startdate;
    }

    /**
     * Source item for the operations batch.
     */
    public SFItem getSource() {
        return this.Source;
    }

    /**
     * Source item for the operations batch.
     */
    public void setSource(SFItem source) {
        this.Source = source;
    }

    /**
     * Destination item for the operations batch (will be the same as Source for changezone operations).
     */
    public SFItem getDestination() {
        return this.Destination;
    }

    /**
     * Destination item for the operations batch (will be the same as Source for changezone operations).
     */
    public void setDestination(SFItem destination) {
        this.Destination = destination;
    }

    /**
     * Source zone for the operations batch.
     */
    public SFZone getSourceZone() {
        return this.SourceZone;
    }

    /**
     * Source zone for the operations batch.
     */
    public void setSourceZone(SFZone sourcezone) {
        this.SourceZone = sourcezone;
    }

    /**
     * Destination zone for the operations batch.
     */
    public SFZone getDestinationZone() {
        return this.DestinationZone;
    }

    /**
     * Destination zone for the operations batch.
     */
    public void setDestinationZone(SFZone destinationzone) {
        this.DestinationZone = destinationzone;
    }

    /**
     * User who initiated the batch.
     */
    public SFUser getInitiatedBy() {
        return this.InitiatedBy;
    }

    /**
     * User who initiated the batch.
     */
    public void setInitiatedBy(SFUser initiatedby) {
        this.InitiatedBy = initiatedby;
    }

    /**
     * Total size of the operations batch in bytes.
     */
    public Long getTotalSizeInBytes() {
        return this.TotalSizeInBytes;
    }

    /**
     * Total size of the operations batch in bytes.
     */
    public void setTotalSizeInBytes(Long totalsizeinbytes) {
        this.TotalSizeInBytes = totalsizeinbytes;
    }

    /**
     * The number of processed bytes in the batch.
     */
    public Long getProcessedBytes() {
        return this.ProcessedBytes;
    }

    /**
     * The number of processed bytes in the batch.
     */
    public void setProcessedBytes(Long processedbytes) {
        this.ProcessedBytes = processedbytes;
    }

    /**
     * The total number of items in the batch.
     */
    public Long getTotalItemCount() {
        return this.TotalItemCount;
    }

    /**
     * The total number of items in the batch.
     */
    public void setTotalItemCount(Long totalitemcount) {
        this.TotalItemCount = totalitemcount;
    }

    /**
     * The number of processed items in the batch.
     */
    public Long getProcessedItemCount() {
        return this.ProcessedItemCount;
    }

    /**
     * The number of processed items in the batch.
     */
    public void setProcessedItemCount(Long processeditemcount) {
        this.ProcessedItemCount = processeditemcount;
    }

    /**
     * The number of processed items in the batch.
     */
    public Long getFailedItemCount() {
        return this.FailedItemCount;
    }

    /**
     * The number of processed items in the batch.
     */
    public void setFailedItemCount(Long faileditemcount) {
        this.FailedItemCount = faileditemcount;
    }

}