package guitar.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import guitar.Entity.guitar;
import JDBC.JDBC;

public class guitarDaoImpl{
	private String sql;
	private Connection conn;
	private PreparedStatement pstmt;
	public boolean add(guitar guitar){
		boolean sign=false;
		sql="insert into guitar values(?,?,?,?,?,?,?);";
		try{
			pstmt =JDBC.getConnection().prepareStatement(sql);
			pstmt.setInt(1, guitar.getSerialNumber());
			pstmt.setDouble(2, guitar.getPrice());
			pstmt.setString(3, guitar.getBuilder());
			pstmt.setString(4, guitar.getModel());
			pstmt.setString(5, guitar.getType());
			pstmt.setString(6, guitar.getBackWood());
			pstmt.setString(7, guitar.getTopWood());
			pstmt.execute();
			pstmt.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sign;
	}
	public List<guitar> search(guitar guitar){
		String sql1="select * from guitar where 1=1 ";
		List<guitar> guitarlistt=new ArrayList<guitar>();
		String builder = guitar.getBuilder();
		String model = guitar.getModel();
		String type = guitar.getType();
		String backwood = guitar.getBackWood();
		String topwood = guitar.getTopWood();
		if(builder.length() > 0){
			sql1+=String.format("and builder='"+builder+"'");
		}
		System.out.println(sql1);
		if(model.length() > 0){
			sql1+=String.format("and model='"+model+"'");
		}
		if(type.length() > 0){
			sql1+=String.format("and type='"+type+"'");
		}
		System.out.println(sql1);
		if(backwood.length() >0){
			sql1+=String.format("and backwood='"+backwood+"'");
		}
		if(topwood.length()>0){
			sql1+=String.format("and topwood='"+topwood+"'");
		}
		System.out.println(sql1);
		try{
			pstmt =JDBC.getConnection().prepareStatement(sql1);      			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
			guitar guitars=new guitar();
			guitars.setSerialNumber(rs.getInt(1));
			guitars.setPrice(rs.getDouble(2));
			guitars.setModel(rs.getString(4));
			guitars.setBuilder(rs.getString(3));
			guitars.setType(rs.getString(5));
			guitars.setBackWood(rs.getString(6));
			guitars.setTopWood(rs.getString(7));
			
			guitarlistt.add(guitars);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return guitarlistt;
	}
	public List<guitar> getAll(){
		sql="select * from guitar";
		List<guitar> guitarlist=new ArrayList<guitar>();
		try{
			pstmt =JDBC.getConnection().prepareStatement(sql);      			
			ResultSet rs=pstmt.executeQuery();
		
			while(rs.next()){
				guitar guitar=new guitar();
				guitar.setSerialNumber(rs.getInt(1));
				guitar.setPrice(rs.getDouble(2));
				guitar.setModel(rs.getString(4));
				guitar.setBuilder(rs.getString(3));
				guitar.setType(rs.getString(5));
				guitar.setBackWood(rs.getString(6));
				guitar.setTopWood(rs.getString(7));
				guitarlist.add(guitar);
			}	
			pstmt.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return guitarlist;
	}

}
