package com.myorganization.sprocket.models.entities;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public enum OrderStatus {
    Closed("Closed") {

        @Override
        void initializeNextAvailableStatus() {
            getNextAvailableStatus()
                    .addAll(Arrays.asList(new OrderStatus[] {}));
        }
    },
    Invoiced("Invoiced") {

        @Override
        void initializeNextAvailableStatus() {
            getNextAvailableStatus().addAll(
                    Arrays.asList(new OrderStatus[] { Shipped }));
        }
    },
    New("New") {

        @Override
        void initializeNextAvailableStatus() {
            getNextAvailableStatus().addAll(
                    Arrays.asList(new OrderStatus[] { Invoiced }));
        }
    },
    Shipped("Shipped") {

        @Override
        void initializeNextAvailableStatus() {
            getNextAvailableStatus().addAll(
                    Arrays.asList(new OrderStatus[] { Closed }));
        }
    };

    private String displayName;

    private SortedSet<OrderStatus> nextAvailableStatus;

    private OrderStatus(final String displayName) {
        this.displayName = displayName;
        nextAvailableStatus = new TreeSet<OrderStatus>();
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @return the availableStatuses
     */
    public SortedSet<OrderStatus> getNextAvailableStatus() {
        return nextAvailableStatus;
    }

    void initializeNextAvailableStatus() {
        // No-op; by default, the assignees have been initialized
    }
}
