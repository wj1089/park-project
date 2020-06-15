package com.parkk.web.Gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.parkk.web.proxy.Proxy;

import java.util.List;

@RestController
@RequestMapping("")
public class GymController {
    @Autowired GymRepository gymRepository;
    @Autowired Proxy pxy;


    @GetMapping("/{searWord}")
    public List<Gym> list(@PathVariable("searchWord") String searchWord) {

        if (searchWord.equals("")) {
            pxy.print("검색어가 없음");
        } else {
            pxy.print("검색어가 " + searchWord);
        }
        for(GymDTO m : list){
            pxy.print(m.toString());
        }
        return gymRepository.findAll();
    }
}
