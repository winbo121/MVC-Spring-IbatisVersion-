package example.winbo.test;

import java.util.List;

public class GuestBookServiceimpl implements GuestBookService{

	GuestBookDAO guestbookDAO;
	
	
	
	public void setGuestbookDAO(GuestBookDAO guestbookDAO) {
		this.guestbookDAO = guestbookDAO;
	}

	@Override
	public List<GuestBookVO> userList(GuestBookVO G) {
		
		return guestbookDAO.userList(G);
	}

	@Override
	public GuestBookVO userRead(String idx) {
		
		return guestbookDAO.userRead(idx);
	}

	@Override
	public void userInsert(GuestBookVO G) {
		guestbookDAO.userInsert(G);
		
	}

	@Override
	public void userDelete(String idx) {
		guestbookDAO.userDelete(idx);
	
	}

	@Override
	public int userAllCount() {
		return guestbookDAO.userAllCount();
	}

}
