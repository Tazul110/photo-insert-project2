package com.example.demo.sms.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.sms.Model.Image;

@Service
public interface ImageService {
	
	Image create(Image image);
	
    List<Image> viewAll(); 
    
    Image viewById(long id);
}
