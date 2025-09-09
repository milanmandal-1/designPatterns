package patterns.src.test.java.design;

public class User {
    private String emailId;
    private String userId;
    private String userName;

    private User(UserBuilder builder) {
        this.emailId = builder.emailId;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    @Override
    public String toString() {
        return userName + ":" + userId + ":" + emailId;
    }

    // --- Builder Class ---
    public static class UserBuilder {
        private String emailId;
        private String userId;
        private String userName;

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // Factory method to start builder
    public static UserBuilder builder() {
        return new UserBuilder();
    }
}
