package be.ehb.laptopLibraryProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyLaptops")
public class MyLaptopList {
	
	@Id
	private int id;
	private String brand;
	private String model;
	private String serialnumber;
	
	public MyLaptopList(int id, String brand, String model, String serialnumber) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.serialnumber = serialnumber;
	}

	public MyLaptopList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	
	

	
}
