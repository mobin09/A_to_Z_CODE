package appUsingSpringBasic;

public class Laptop {
    private String color;
    private String name;
    LaptopConfig config;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LaptopConfig getConfig() {
		return config;
	}
	public void setConfig(LaptopConfig config) {
		this.config = config;
	}
}
