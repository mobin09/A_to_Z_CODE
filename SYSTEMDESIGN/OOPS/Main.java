public class Main {
    
    public static void notifyUser(NotificationSender notification, String message){
        notification.sendNotification(message);
    }

    public static void main(String[] args) {
       NotificationSender notificationSender = new EmailSender();
       notifyUser(notificationSender, "Please look to this email");
    }
}

// output:  Send Email::Please look to this email