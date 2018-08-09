package services;

import java.sql.*;

public class SQLConnector {
	private Connection con;
	private Statement query;
	private ResultSet result;
	private ResultSetMetaData meta;
	
	/**Ennek a metódusnak a segítségével csatlakozhatunk a megadott mysql adatbázishoz.
	 * Midhárom paraméter megléte sestén a program csatlakozik a megadott adatbázishoz.
	 *@param forName Ide kerül az SQL adatbázis csomag eléres MYSQL = "com.mysql.jdbc.Driver" MSSQL = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
	 *@param URL Ide kerül az adatbázis elérési útja pl: MYSQL = jdbc:mysql://127.0.0.1/javadb?useSSL=false
	 *@param user Ide kerül az adatbázishoz tartozó felhasználói név
	 *@param pass Ide kerül az adatbázishoz tartozó jelszó
	 * **/
	
	public void setDataBaseConnection(String forName, String URL, String user, String pass) throws Exception{
			Class.forName(forName);
			this.con = DriverManager.getConnection(URL, user, pass);
	}
	
	public void createStatement() throws Exception{
		this.query = con.createStatement();
	}
	
	public int updateDatabase(String sql) throws Exception {
		return query.executeUpdate(sql);
	}
	
	public String setQuery(String sql) throws Exception{
		this.result = query.executeQuery(sql);
		return sql;
	}
	
	public void setMetaData() throws Exception{
		this.meta = result.getMetaData();
	}
	
	public String getMetaLabel(int column) throws Exception{
		return meta.getColumnLabel(column);
	}
	
	public int getMetaColumn() throws Exception{
		return meta.getColumnCount();
	}
	
	public boolean next() throws Exception{
		return result.next();
	}
	
	public String getResult(int column) throws Exception{
			return result.getString(column);
	}
	
	public void close() throws Exception{
		result.close();
	}
	
}
