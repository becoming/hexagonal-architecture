package com.example.appapi;

import com.example.appapi.dto.NewProfileDto;
import com.example.appapi.dto.ProfileDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles/v1/")
public interface ProfileContract {

    @GetMapping
    List<ProfileDto> findAll();

    @PostMapping
    ProfileDto create(@RequestBody NewProfileDto p);

}
