package design;

import java.util.ArrayList;
import java.util.List;

public class prototypeDesignPattern implements Cloneable{


    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();



    public List<String> getDomains() {
		return domains;
	}


	public void setDomains(List<String> domains) {
		this.domains = domains;
	}


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
        domains.add("www.google.com");
        domains.add("www.milan.com");
        domains.add("www.domain.com");
        domains.add("www.restapi.com");
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return this.importantData+" "+this.ip+" "+this.domains;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

    	prototypeDesignPattern ptdp = new prototypeDesignPattern();
    	ptdp.setIp(this.getIp());
    	ptdp.setImportantData(this.getImportantData());

    	for(String d : this.getDomains()) {

    		ptdp.getDomains().add(d);

    	}

    return ptdp;
}

}