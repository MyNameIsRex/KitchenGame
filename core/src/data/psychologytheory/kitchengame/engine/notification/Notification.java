package data.psychologytheory.kitchengame.engine.notification;

public class Notification {
    private final String receiverName;
    private String token;
    private boolean hasReceived;

    public Notification(String receiverName) {
        this.receiverName = receiverName;
        this.token = "";
        this.hasReceived = false;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public boolean isHasReceived() {
        return hasReceived;
    }

    public void setHasReceived(boolean hasReceived) {
        this.hasReceived = hasReceived;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String Token) {
        this.token = token;
    }
}
