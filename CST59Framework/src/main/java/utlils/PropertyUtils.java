package utlils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.cs.constants.FrameworkConstants;
import com.cs.enums.configProperty;

public final class PropertyUtils {
	
	private static Properties prop = new Properties();
	private static final Map<String,String> ConfigMap = new HashMap<>(); 
	
	static{
		
		 
		try {
			FileInputStream	fis = new FileInputStream(FrameworkConstants.getConfigPath());
			
				prop.load(fis);
				for(Map.Entry<Object,Object> map : prop.entrySet()) {
					ConfigMap.put(String.valueOf(map.getKey()), String.valueOf(map.getValue()).trim());
				}
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			}
	
	
	public static String getValue(configProperty key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(ConfigMap.get(key.name().toLowerCase())))
			
			throw new Exception("problem in reading property " + key + " please check config.properties file");
		return ConfigMap.get(key.name().toLowerCase());
	
	}
	
	private PropertyUtils() {
		
	}
}
