package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	
	private String name;
	private Double value;
	private Date date;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Product(){
		
	}

	public Product(String name, Double value, Date date) {
		super();
		this.name = name;
		this.value = value;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	
	public String toString() {
		
		return name + ", " + String.format("%.2f", value) + ", " +  sdf.format(date);
	}

}
