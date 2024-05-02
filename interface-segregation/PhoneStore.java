public class PhoneStore {
    public static void main(String[] args) {
        var basicPhone = new BasicPhone();
        var iPhone = new IPhone();
        var samsung = new Samsung();

        basicPhone.makeCall("123");
        basicPhone.sendSMS("123", "Hello basic phone");

        iPhone.makeCall("456");
        iPhone.sendSMS("456", "Hello iPhone");
        iPhone.browseWeb("iphone.com");
        iPhone.takePicture();

        samsung.makeCall("789");
        samsung.sendSMS("789", "Hello Samsung");
        samsung.browseWeb("samsung.com");
        samsung.takePicture();
    }
}