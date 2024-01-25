public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private int age;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.email = userBuilder.email;
        this.address = userBuilder.address;
        this.phone = userBuilder.phone;
        this.age = userBuilder.age;
    }

    protected static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private int age;

        public UserBuilder addFirstName(String firstName) {
            this.firstName = firstName;

            return this;
        }

        public UserBuilder addLastName(String lastName) {
            this.lastName = lastName;

            return this;
        }

        public UserBuilder addEmail(String email) {
            this.email = email;

            return this;
        }

        public UserBuilder addAddress(String address) {
            this.address = address;

            return this;
        }

        public UserBuilder addPhone(String phone) {
            this.phone = phone;

            return this;
        }

        public UserBuilder addAge(int age) {
            this.age = age;

            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}