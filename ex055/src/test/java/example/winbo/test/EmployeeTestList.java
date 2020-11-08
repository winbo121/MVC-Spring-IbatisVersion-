package example.winbo.test;

import java.io.Reader;
import java.util.List;

import javax.annotation.Resource;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class EmployeeTestList {

	public static Reader reader;
	public static SqlMapClient sqlMapper;
	
	
	public static List<Employee> getSearchAll() throws Exception{
		reader=Resources.getResourceAsReader("gta/winbo/ex1/sqlMapConfig.xml");
		sqlMapper=SqlMapClientBuilder.buildSqlMapClient(reader);
		reader.close();
		return sqlMapper.queryForList("searchAll");
		
	}
	
	public static List<Employee> getSearchJob(String n) throws Exception{
		reader=Resources.getResourceAsReader("gta/winbo/ex1/sqlMapConfig.xml");
		sqlMapper=SqlMapClientBuilder.buildSqlMapClient(reader);
		reader.close();
		return sqlMapper.queryForList("searchJob",n);
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
	List<Employee> list=getSearchAll();
	for (Employee e: list) {
		System.out.println("번호:"+e.getEmpno()+" 이름:"+e.getEname()+" 직업:"+e.getJob());
	}
		
		
	List<Employee> list2=getSearchJob("ANALYST");
	
	for (Employee e:list2) {
		System.out.println("ANALYST:"+e.getEname());
	}
		
	}

}
