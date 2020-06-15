package com.parkk.web.mappers;

import com.parkk.web.Gym.GymDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GymMapper {
    public List<GymDTO> selectAll();

}
