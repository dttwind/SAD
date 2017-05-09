package guitar.Action;

import com.opensymphony.xwork2.ActionSupport;

import guitar.Dao.guitarDaoImpl;
import guitar.Entity.guitar;
import guitar.Service.guitarService;

public class AddAction extends ActionSupport{
	private int serialNumber;
	private Double price;
	private String model;
	private String type;
	private String builder;
	private String backWood;
	private String topWood;
	
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	public String execute() throws Exception{
		guitarService guitarService=new guitarService();
		guitarDaoImpl a=new guitarDaoImpl();
		guitar guitar=new guitar();
		guitar.setSerialNumber(serialNumber);
		guitar.setPrice(price);
		guitar.setBuilder(builder);
		guitar.setModel(model);
		guitar.setType(type);
		guitar.setBackWood(backWood);
		guitar.setTopWood(topWood);
		a.add(guitar);
		return SUCCESS;
	}
}
