package com.webrestapi.webrestapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface FormDetailsRepo extends JpaRepository<FormDetails, Long> {

    @Modifying
    @Transactional
    @Query(value = "insert into simpleform (first_name, last_name,email,gender,id,percentange,phone_number) values('Rakesh', 'Rahul', 'Prakesh@gmail.com', 'male', 3, '10', '1234')", nativeQuery = true)
    int insertNewRow();

    @Modifying
    @Transactional
    @Query(value = "update simpleform set status = :status where id = :id", nativeQuery = true)
    int updateStatus(@Param("id")int id,
                     @Param("status")String status);
}
