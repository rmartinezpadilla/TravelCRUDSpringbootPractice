/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.travel.service;

import com.api.travel.mapper.TravelInDTOToTravel;
import com.api.travel.persistence.entity.Travel;
import com.api.travel.persistence.repository.TravelRepository;
import com.api.travel.service.dto.TravelInDTO;
import org.springframework.stereotype.Service;

/**
 *
 * @author Equipo
 */
@Service
public class TravelService {

    
    
    private final TravelRepository travelRepository;
    
    private final TravelInDTOToTravel mapper;
    
    
    public TravelService(TravelRepository travelRepository, TravelInDTOToTravel mapper) {
        this.travelRepository = travelRepository;
        this.mapper = mapper;
    }
    
    //escribimos el método para crear un nuevo viaje
    public Travel createTravel(TravelInDTO travelInDTO){
        //convertimor el objeto TasjIndto a task para poder enviarlo al repositorio
        Travel travel = mapper.map(travelInDTO);
        return this.travelRepository.save(travel);
    }
    
    
    
}
