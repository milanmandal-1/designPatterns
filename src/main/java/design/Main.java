package patterns.src.main.java.design;

import patterns.src.test.java.design.User;

public class Main {
    public static void main(String[] args) {
        User user1 = User.builder()
                .setEmailId("d@gmail.com")
                .setUserId("Milan")
                .setUserName("Durgesh")
                .build();

        System.out.println(user1);

        User user2 = User.builder()
                .setEmailId("s@gmail.com")
                .setUserId("user@1234")
                .setUserName("milan")
                .build();

        System.out.println(user2);
    }
}
