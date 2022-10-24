package ISP;

public class GmailAccount implements Emailable {

	String name, emailAddress;
	
	public GmailAccount(String name, String emailAddress) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String getEmail() {
		return emailAddress;
	}
	
	
	
	public void setEmail(String email) {
		this.emailAddress = email;
	}

}
