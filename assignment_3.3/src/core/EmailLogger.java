package core;

public class EmailLogger implements Logging{

	@Override
	public void log(String data) {

		System.out.println("Email gönderildi : " + data);
	}

}
