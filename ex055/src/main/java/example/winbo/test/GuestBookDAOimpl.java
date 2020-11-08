package example.winbo.test;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class GuestBookDAOimpl extends SqlMapClientDaoSupport implements GuestBookDAO{

	@Override
	public List<GuestBookVO> userList(GuestBookVO G) {
		
		return (List<GuestBookVO>)getSqlMapClientTemplate().queryForList("userList",G);
	}

	@Override
	public GuestBookVO userRead(String idx) {
		
		return (GuestBookVO)getSqlMapClientTemplate().queryForObject("userRead",idx);
	}

	@Override
	public void userInsert(GuestBookVO G) {
		getSqlMapClientTemplate().insert("userInsert", G);
	
	}


	@Override
	public void userDelete(String idx) {
		getSqlMapClientTemplate().delete("userDelete",idx);
		
	}

	@Override
	public int userAllCount() {
		
		return (Integer) getSqlMapClientTemplate().queryForObject("userAllCount");
	}

}
