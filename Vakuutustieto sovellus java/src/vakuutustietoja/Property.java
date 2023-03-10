package vakuutustietoja;

public class Property {
	
	private String type;
	private String location;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Property(String type, String location) {
		this.type = type;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Property [type=" + type + ", location=" + location + "]";
	}

}
