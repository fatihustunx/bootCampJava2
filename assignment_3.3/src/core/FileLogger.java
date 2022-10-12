package core;

public class FileLogger implements Logging{

	@Override
	public void log(String data) {

		System.out.println("Dosyaya loglandý : " + data);
	}

}
