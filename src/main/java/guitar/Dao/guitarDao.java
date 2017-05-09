package guitar.Dao;
import java.util.List;

import guitar.Entity.guitar;
public interface guitarDao {
	public boolean add(guitar guitar);
	public List<guitar> search(guitar guitar);
	public List<guitar> getAll();
}
