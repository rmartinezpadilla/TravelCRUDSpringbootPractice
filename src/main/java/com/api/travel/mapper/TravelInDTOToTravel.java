/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.travel.mapper;

import com.api.travel.persistence.entity.Travel;
import com.api.travel.service.dto.TravelInDTO;
import com.api.travel.persistence.entity.*;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

/**
 *
 * @author Equipo
 */
@Component
public class TravelInDTOToTravel implements IMapper<TravelInDTO, Travel>{

    @Override
    public Travel map(TravelInDTO in) {
        Travel travel = new Travel();
        travel.setCiudadSalida(in.getCiudadSalida());
        travel.setCiudadLlegada(in.getCiudadLlegada());
        travel.setContenido(in.getContenido());
        travel.setResponsable(in.getResponsable());
        travel.setFechaSalida(in.getFechaSalida());
        travel.setFechaLlegada(in.getFechaLlegada());
        travel.setFechaCreacion(LocalDateTime.now());
        travel.setTravelStatus(TravelStatus.CREADO_SIN_INICIAR);
        return travel;
    }
    
}
