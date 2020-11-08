package example.winbo.test;

import java.util.List;

public interface GuestBookDAO {
	
	public List<GuestBookVO> userList(GuestBookVO G);
	public GuestBookVO userRead(String idx);
	public void userInsert(GuestBookVO G);
	public void userDelete(String idx);
	public int userAllCount();
	
	

}
