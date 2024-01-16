package data.psychologytheory.kitchengame.engine.utils;

import data.psychologytheory.kitchengame.engine.notification.Notification;
import data.psychologytheory.kitchengame.gameplay.gameobjects.AbstractGameObject;
import data.psychologytheory.kitchengame.gameplay.init.GameObjectInit;
import data.psychologytheory.kitchengame.gameplay.lists.GameObjectList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class NotificationUtil {
    public static NotificationUtil instance;
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "1234567890";
    private static final String SYMBOLS = "+/";

    private static final List<Notification> UNHANDLED_NOTIFICATION_POOL = new ArrayList<>();

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
        UNHANDLED_NOTIFICATION_POOL.add(notification);
    }
    
    public void deliverToken(Notification notification, String receiver) {
        final String token;
        GameObjectInit.GAME_OBJECT_MAP.forEach((integer, gameObject) -> {
            if (Objects.equals(gameObject.getObjName(), receiver)) {
                NotificationUtil.getInstance().receiveToken(gameObject, notification);
            }
        });
    }

    public void receiveToken(AbstractGameObject gameObject, Notification notification) {
        gameObject.setReceivedToken(notification.getToken());
    }
    
    public String getToken(Notification notification) {
        return notification.getToken();
    }

    public void receiveNotification(String token) {
        UNHANDLED_NOTIFICATION_POOL.forEach(notification -> {
            if (Objects.equals(token, NotificationUtil.getInstance().getToken(notification))) {
                UNHANDLED_NOTIFICATION_POOL.remove(notification);
            }
        });
    }

    public static NotificationUtil getInstance() {
        if (instance == null) {
            instance = new NotificationUtil();
        }
        return instance;
    }
}
