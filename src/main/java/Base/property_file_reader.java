package Base;

import java.util.Properties;

public class property_file_reader extends datas{
	
	Properties pro = new Properties();
	
	public void load_properties() {
		try {
			pro.load(getClass().getResourceAsStream("/property_file"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		browser = pro.getProperty("browser");
		
		
		
	}
}
