package ui;

public class SignInUI extends UI{
	private String id;
	private String ps;
	
	public void signIn() {
		System.out.println("signIn()");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}
}
