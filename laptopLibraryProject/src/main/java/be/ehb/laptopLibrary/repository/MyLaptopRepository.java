package be.ehb.laptopLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.ehb.laptopLibraryProject.entity.MyLaptopList;

@Repository
public interface MyLaptopRepository extends JpaRepository<MyLaptopList, Integer>{

}
