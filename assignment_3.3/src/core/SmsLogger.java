package core;

public class SmsLogger implements Logging {

	@Override
	public void log(String data) {

		System.out.println("Sms gönderildi : " + data);
	}

}
