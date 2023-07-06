/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.travel.controller;

import com.api.travel.persistence.entity.Travel;
import com.api.travel.service.TravelService;
import com.api.travel.service.dto.TravelInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Equipo
 */
@RestController
@RequestMapping("/travel")
public class TravelController {
    private final TravelService travelService;
    
    public TravelController(TravelService travelService){
        this.travelService = travelService;
    }
    
    @PostMapping
    public Travel createTravel(@RequestBody TravelInDTO travelInDTO){
        return this.travelService.createTravel(travelInDTO);
    }
}
