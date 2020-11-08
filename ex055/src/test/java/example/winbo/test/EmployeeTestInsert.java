package example.winbo.test;

import java.io.Reader;


import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class EmployeeTestInsert {

	public static Reader reader;
	public static SqlMapClient sqlMapper;
	public static void insertHuman(Employee E ) throws Exception{
		reader=Resources.getResourceAsReader("gta/winbo/ex1/sqlMapConfig.xml");
		sqlMapper=SqlMapClientBuilder.buildSqlMapClient(reader);
		
		sqlMapper.insert("insertHuman", E);
		reader.close();
		
	}
	public static void main(String[] args) throws Exception {
			
		
		Employee E=new Employee();
		E.setEmpno(55);
		E.setEname("±èÀçÈÆ");
		E.setJob("ÇÐ»ý");
		E.setSal(50);
		
		insertHuman(E);

	}

}
