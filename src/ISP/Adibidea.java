package ISP;

public class Adibidea {

	public static void main(String[] args) {
		
		GmailAccount gmail = new GmailAccount("aitor", "aarruti@ikasle.ehu.eus");
	
		EmailSender.sendEmail(gmail, "kaixo");		
	}
}







