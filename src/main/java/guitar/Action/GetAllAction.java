package guitar.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import guitar.Dao.guitarDaoImpl;
import guitar.Entity.guitar;
import guitar.Service.guitarService;

public class GetAllAction extends ActionSupport{
	public String execute() throws Exception{
		guitarService guitarService=new guitarService();
		guitarDaoImpl a=new guitarDaoImpl();
		List<guitar> list=guitarService.getAll();
		ActionContext.getContext().getSession().put("guitarlistt", list);
		return SUCCESS;
	}
}
