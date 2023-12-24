package com.example.demo.sms.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.sms.Model.Image;

@Repository
public interface ImageRepository extends CrudRepository<Image, Long>
{

}
