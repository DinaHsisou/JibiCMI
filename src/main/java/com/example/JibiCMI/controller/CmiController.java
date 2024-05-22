package com.example.JibiCMI.controller;

import com.example.JibiCMI.model.CmiResponse;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cmi")
public class CmiController {



    @PostMapping("/verify")
    public CmiResponse verifyClient() {
        // Always return a favorable response
        CmiResponse response = new CmiResponse();
        response.setFavorable(true);
        return response;
    }
}

