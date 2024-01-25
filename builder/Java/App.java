public class App {
    public static void main(String[] args) {
        User david = new User.UserBuilder()
                .addFirstName("David King")
                .addLastName("Roderos")
                .addEmail("dk.roderos@proton.me")
                .addAge(20)
                .addPhone("09123456789")
                .addAddress("Smile Citihomes")
                .build();

        User walt = new User.UserBuilder()
                .addEmail("walter.white@gmail.com")
                .addAddress("308 Negra Arroyo Lane")
                .addLastName("White")
                .addAge(52)
                .addPhone("505-842-5662")
                .addFirstName("Heisenberg")
                .addFirstName("Walter")
                .build();

        User gus = new User.UserBuilder()
                .addLastName("Fring")
                .addEmail("gustavo.fring@gmail.com")
                .addAddress("Los Pollos Hermanos, Albuquerque")
                .addPhone("3000000")
                .addFirstName("Gustavo")
                .addAge(51)
                .build();

        System.out.println(david);
        System.out.println(walt);
        System.out.println(gus);
    }
}
