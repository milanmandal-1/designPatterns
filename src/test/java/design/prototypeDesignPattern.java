package patterns.src.test.java.design;

public class prototypeDesignPattern implements Cloneable{


    private String ip;
    private String importantData;
    

    public void setIp(String ip) {
        this.ip = ip;
    }


    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }
    
    public String getIp() {
        return ip;
    }


    public String getImportantData() {
        return importantData;
    }

    public void loadImportantData() throws InterruptedException{
        this.importantData = "very very important Data";
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return this.importantData+" "+this.ip;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
    return super.clone();
}

}