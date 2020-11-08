package example.winbo.test;

public class PageMaker {
	
	private int totalCount;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	private int displayPageNum=5; //다음 가기전까지 페이지 갯수
	private int displayContentNum=10; //각 페이지당 게시물 갯수

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount,int page) {
		this.totalCount = totalCount;
		
		endPage=(int)(Math.ceil(page/(double)displayPageNum)*displayPageNum);
	
		startPage=(endPage-displayPageNum)+1;
		
		int tempEndPage=(int)(Math.ceil(totalCount/(double)displayContentNum));
		
		if(endPage>tempEndPage) {
			endPage=tempEndPage;
		}
	
		prev=startPage==1?false:true;
		next=(endPage*displayContentNum)>=totalCount?false:true;

		
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

	public int getDisplayContentNum() {
		return displayContentNum;
	}

	public void setDisplayContentNum(int displayContentNum) {
		this.displayContentNum = displayContentNum;
	}


}
