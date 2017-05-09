package guitar.Service;
import java.util.List;

import guitar.Dao.*;
import guitar.Entity.guitar;
public class guitarService {
	private static  guitarDaoImpl guitarDao=new guitarDaoImpl();


	
	public static guitarDaoImpl getGuitarDao() {
		return guitarDao;
	}
	public static void setGuitarDao(guitarDaoImpl guitarDao) {
		guitarService.guitarDao = guitarDao;
	}
	public boolean add(guitar guitar){
		return guitarDao.add(guitar);
	}
	public List<guitar> search(guitar guitar){
		return guitarDao.search(guitar);
	}
	public List<guitar> getAll(){
		return guitarDao.getAll();
	}
}
