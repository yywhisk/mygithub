package com.whisky.dao;

import com.whisky.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cloudyao on 2016/11/14.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    List<Person> findByAddress(String name);
    Person findByNameAndAddress(String name,String address);
    @Query("select p from Person p where p.name= :name and p.address= :address")
    Person withNameAndAddressQuery(@Param("name")String name, @Param("address")String address);
    Person withNameAndAddressNamedQuery(String name,String address);
}
