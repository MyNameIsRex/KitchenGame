package data.psychologytheory.kitchengame.engine.utils;

import data.psychologytheory.kitchengame.engine.notification.Notification;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/*
REFER TO THIS PROCEDURE IF NEEDED!

On sender side:
    In update method:
    1. createNotification(AbstractGameObject receiver);
    2. sendNotification(Notification notification);
    3. deliverToken(Notification notification, String receiver);

On receiver side:
    In update method:
    if (this.isAttemptToReceiveNotification()) {
        if (!(Objects.equals(NotificationUtil.getInstance().receiveNotification(this.getReceivedToken()), null))) {
            Notification testNotification = NotificationUtil.getInstance().receiveNotification(this.getReceivedToken());
            if (NotificationUtil.getInstance().isNotificationReceived(testNotification)) {
                // Execute Code Here
            }
        }
    }
 */
public class NotificationUtil {
    public static NotificationUtil instance;
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "1234567890";
    private static final String SYMBOLS = "+/";

    private static final Map<String, Notification> UNHANDLED_NOTIFICATION_POOL = new HashMap<>();

    public Notification createNotification(AbstractGameObject receiver) {
        return new Notification(receiver.getObjName());
    }

    public String generateToken() {
        StringBuilder token = new StringBuilder();
        int characterCount = 15;
        Random rand = new Random();

        for (int i = 0; i < characterCount; i++) {
            switch (rand.nextInt(4)) {
                case 0:
                    token.append(UPPER_CASE.charAt(rand.nextInt(UPPER_CASE.length())));
                    continue;
                case 1:
                    token.append(LOWER_CASE.charAt(rand.nextInt(LOWER_CASE.length())));
                    continue;
                case 2:
                    token.append(DIGITS.charAt(rand.nextInt(DIGITS.length())));
                    continue;
                case 3:
                    token.append(SYMBOLS.charAt(rand.nextInt(SYMBOLS.length())));
                    continue;
                default:
            }
        }
        return token.toString();
    }

    public void sendNotification(Notification notification) {
        notification.setToken(NotificationUtil.getInstance().generateToken());
        UNHANDLED_NOTIFICATION_POOL.put(notification.getToken(), notification);
    }
    
    public void deliverToken(Notification notification, String receiver) {
        GameObjectInit.GAME_OBJECT_MAP.forEach((integer, gameObject) -> {
            if (Objects.equals(gameObject.getObjName(), receiver)) {
                NotificationUtil.getInstance().receiveToken(gameObject, notification);
            }
        });
    }

    public void receiveToken(AbstractGameObject gameObject, Notification notification) {
        gameObject.setReceivedToken(notification.getToken());
    }
    
    public Notification receiveNotification(String token) {
        Notification notification = UNHANDLED_NOTIFICATION_POOL.get(token);
        notification.setHasReceived(true);
        UNHANDLED_NOTIFICATION_POOL.remove(token);
        return notification;
    }

    public boolean isNotificationReceived(Notification notification) {
        return notification.isReceived();
    }

    public void setNotificationReceived(Notification notification, boolean received) {
        notification.setHasReceived(received);
    }

    public static NotificationUtil getInstance() {
        if (instance == null) {
            instance = new NotificationUtil();
        }
        return instance;
    }
}
