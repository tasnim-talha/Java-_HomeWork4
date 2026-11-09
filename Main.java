
public class Main {

    public static void main(String[] args) {

        WorkshopRegistration registration =
                new WorkshopRegistration();

        try {
            registration.registerParticipant("Ali", 16);

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());
        }
    }
}
