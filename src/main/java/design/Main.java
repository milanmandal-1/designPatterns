package patterns.src.main.java.design;

import patterns.src.test.java.design.User;
import patterns.src.test.java.design.prototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // User user1 = User.builder()
        //         .setEmailId("d@gmail.com")
        //         .setUserId("Milan")
        //         .setUserName("Durgesh")
        //         .build();

        // System.out.println(user1);

        // User user2 = User.builder()
        //         .setEmailId("s@gmail.com")
        //         .setUserId("user@1234")
        //         .setUserName("milan")
        //         .build();

        // System.out.println(user2);c


        prototypeDesignPattern  ptdp = new prototypeDesignPattern();
        ptdp.setIp("192.168.4.4");
        ptdp.loadImportantData();

        System.out.println(ptdp);

        // Here the object is cloned from the above created object
        try{
            prototypeDesignPattern ptdp1 = (prototypeDesignPattern)ptdp.clone();
            System.out.println(ptdp1);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
