package com.parkk.web.Gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proxy.FileUploader;

import java.util.List;

@RestController
@RequestMapping("")
public class GymController {
    @Autowired GymRepository gymRepository;
    
    @GetMapping("/aaa")
    public List<Gym> list(){
        return gymRepository.findAll();
    }
}
