import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Handlingdatareading {

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("username.dir");
		System.out.println(path);
		File f = new File("E:\\for_automation\\Practie1\\Configuration\\data.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("id"));

	}

}
