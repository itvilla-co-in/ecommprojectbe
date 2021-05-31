package com.itvilla.ecomm.prod.dao;

 import com.itvilla.ecomm.prod.entity.Customer;
 import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

    Customer findByEmail(String theEmail);

}


