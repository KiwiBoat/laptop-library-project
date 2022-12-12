package be.ehb.laptopLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.ehb.laptopLibrary.repository.MyLaptopRepository;
import be.ehb.laptopLibraryProject.entity.MyLaptopList;

@Service
public class MyLaptopListService {
	
	@Autowired
	private MyLaptopRepository mylaptop;

	public void saveMyLaptops(MyLaptopList laptop) {
		mylaptop.save(laptop);
		
	}
	
	public List<MyLaptopList> getAllMyLaptops() {
		return mylaptop.findAll();
	}
}
