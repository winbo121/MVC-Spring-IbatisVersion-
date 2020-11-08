package example.winbo.test;

public class GuestBookVO {


	
	private String name;
	private String password;
	private int offset;
	private int limits;

	
		
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimits() {
		return limits;
	}
	public void setLimits(int limits) {
		this.limits = limits;
	}

	
}
