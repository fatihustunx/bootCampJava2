package core;

public class DatabaseLogger implements Logging {

	@Override
	public void log(String data) {

		System.out.println("Veritabanına loglandı : " + data);
	}

}
