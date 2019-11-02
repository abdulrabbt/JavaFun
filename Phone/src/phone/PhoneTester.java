package phone;

public class PhoneTester {
    public static void main(String[] args) {
        Galaxy note10 = new Galaxy("NOTE 10", 100, "Zine", "Hello world");
        IPhone iPhoneX = new IPhone("X MAX", 100, "STC", "Ping Ping Ping");

        note10.displayInfo();
        System.out.println(note10.ring());
        System.out.println(note10.unlock());

        iPhoneX.displayInfo();
        System.out.println(iPhoneX.ring());
        System.out.println(iPhoneX.unlock());
    }
}
