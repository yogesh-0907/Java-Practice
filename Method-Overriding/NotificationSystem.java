class Notification {

    void send() {
        System.out.println("Sending Notification");
    }
}

class EmailNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending Email");
    }

    public static void main(String[] args) {

        EmailNotification e = new EmailNotification();

        e.send();
    }
}