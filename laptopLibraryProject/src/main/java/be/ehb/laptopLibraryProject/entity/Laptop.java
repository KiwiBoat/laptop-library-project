package be.ehb.laptopLibraryProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

@Entity
public class Laptop {
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	private String brand;
	private String model;
	private String serialNumber;
	
	public Laptop(int id, String brand, String model, String serialNumber) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.serialNumber = serialNumber;
	}

	public Laptop() {
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

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
	

}
