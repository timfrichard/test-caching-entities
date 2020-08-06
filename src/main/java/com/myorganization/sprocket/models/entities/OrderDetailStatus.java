package com.myorganization.sprocket.models.entities;

public enum OrderDetailStatus {

    Allocated("Allocated"), Invoiced("Invoiced"), No_Stock("No Stock"), None(
            "None"), On_Order("On Order"), Shipped("Shpped");

    private String displayName;

    private OrderDetailStatus(final String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }
}
