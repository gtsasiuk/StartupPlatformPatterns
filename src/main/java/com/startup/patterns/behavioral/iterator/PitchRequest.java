package com.startup.patterns.behavioral.iterator;

public class PitchRequest {
    private final long id;
    private final String startupName;
    private final double requestedAmount;
    private ProjectCategory category;
    private RequestStatus status;

    public PitchRequest(long id, String startupName, double requestedAmount,
                        ProjectCategory category, RequestStatus status) {
        this.id = id;
        this.startupName = startupName;
        this.requestedAmount = requestedAmount;
        this.setCategory(category);
        this.setStatus(status);
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public ProjectCategory getCategory() {
        return category;
    }

    public final void setCategory(ProjectCategory category) {
        this.category = category;
    }

    public boolean isOpen() {
        return status.equals(RequestStatus.OPEN);
    }

    @Override
    public String toString() {
        return id + " Request for investments [" + "startupName='" + startupName +
                ", requestedAmount=" + requestedAmount +
                ", category=" + category +
                ", status=" + status +
                ']';
    }
}
