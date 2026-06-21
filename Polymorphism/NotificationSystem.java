class Notification {

    void send() {
        System.out.println("Sending notification");
    }
}

class EmailNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending notification through Email");
    }
}

class SMSNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending notification through SMS");
    }
}

class PushNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending Push Notification");
    }
}

public class NotificationSystem {

    public static void main(String[] args) {

        Notification[] notifications = {
            new EmailNotification(),
            new SMSNotification(),
            new PushNotification()
        };

        for(Notification notification : notifications) {
            notification.send();
        }
    }
}