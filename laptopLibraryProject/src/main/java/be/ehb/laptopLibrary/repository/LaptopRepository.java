package be.ehb.laptopLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.ehb.laptopLibraryProject.entity.Laptop;

// repository annotation to indicate that it is a repository class
@Repository

// extends from JPARepository, it provides the basic functionalities like save, update and delete.
public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

}
