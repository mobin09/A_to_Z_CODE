public interface NotificationSender {
    public void sendNotification(String message);
}

class EmailSender implements NotificationSender {
    public void sendNotification(String message){
        System.out.println("Send Email::" + message);
    }
}

class SmsSender implements NotificationSender {
    public void sendNotification(String message){
        System.out.println("Send SMS::" + message);
    }
}
