package com.zerock.api01.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @ApiOperation("Sample GET doA")
    @GetMapping("/doA")
    //@PreAuthorize("hasRole('ROLE_USER')")
    public List<String> doA() {
        return Arrays.asList("AAA","BBB","CCC");
    }
}
