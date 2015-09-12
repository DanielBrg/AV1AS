package entities;

import java.util.HashMap;
import java.util.Map;

public class Specification {
	
	private Map<String, Object> properties;
	
	public Specification() {
		properties = new HashMap<String, Object>();
	}
	
	public Specification addProperty(String key, Object value) {
		this.properties.put(key, value);
		return this;
	}
	
	public Map<String, Object> getProperties() {
		return this.properties;
	}
	
	public boolean contains(Specification sp) {
		Map<String, Object> prop = sp.getProperties();
		return this.properties.values().containsAll(prop.values()) && this.properties.keySet().containsAll(prop.keySet());
	}	
	
}
