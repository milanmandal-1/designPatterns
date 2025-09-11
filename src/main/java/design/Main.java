package design;


public class Main {
    public static void main(String[] args) throws InterruptedException {


        prototypeDesignPattern  ptdp = new prototypeDesignPattern();
        ptdp.setIp("192.168.4.4");
        ptdp.loadImportantData();

        // Here the object is cloned from the above created object
        // It is a deep copy

        try{

            prototypeDesignPattern ptdp2 = (prototypeDesignPattern)ptdp.clone();
            prototypeDesignPattern ptdp3 = (prototypeDesignPattern)ptdp.clone();
            prototypeDesignPattern ptdp4 = (prototypeDesignPattern)ptdp.clone();

            System.out.println(ptdp);
            ptdp2.getDomains().remove(0);
            System.out.println(ptdp2);
            System.out.println(ptdp3);
            System.out.println(ptdp4);

        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
