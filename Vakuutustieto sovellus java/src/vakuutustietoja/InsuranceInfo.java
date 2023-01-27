package vakuutustietoja;

public class InsuranceInfo {
	
	private Property property;
	private double value;
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getType() {
		return property.getType();
	}
	public void setType(String type) {
		property.setType(type);
	}
	public String getLocation() {
		return property.getLocation();
	}
	public void setSijainti(String location) {
		property.setLocation(location);
	}
	public InsuranceInfo(Property property, double value) {
		this.value = value;
		this.property = property;
	}
	@Override
	public String toString() {
		return property.toString() + ",value: " + value;
	}

}
