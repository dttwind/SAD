package guitar.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import guitar.Dao.guitarDaoImpl;
import guitar.Entity.guitar;
import guitar.Service.guitarService;

@SuppressWarnings("serial")
public class SearchAction extends ActionSupport{
	private Double price;
	private String builder;
	private String model;
	private String type;
	private String backWood;
	private String topWood;
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
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
		guitar guitar=new guitar();
		
		System.out.println(guitar.getPrice());
		guitar.setBuilder(builder);
		guitar.setModel(model);
		guitar.setType(type);
		guitar.setBackWood(backWood);
		guitar.setTopWood(topWood);
		List<guitar> guitarlistt=guitarService.search(guitar);
		
		ActionContext.getContext().getSession().put("guitarlistt", guitarlistt);
		return SUCCESS;
	}
}
