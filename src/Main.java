public class Main {
    public static void main(String[] args) {
        User john = new User("john",1954,12,18);
        john.displayInfo();
        john.displayHappyBirthday();
        Admin nicolas = new Admin("nicolas",1964,12,18);
        nicolas.displayInfo(true);
        nicolas.displayHappyBirthday();
    }
}