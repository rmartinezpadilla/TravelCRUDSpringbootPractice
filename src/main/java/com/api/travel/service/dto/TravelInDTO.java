/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.travel.service.dto;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author Equipo
 */
@Data
public class TravelInDTO {
    private String ciudadSalida;
    private String ciudadLlegada;
    private String contenido;
    private String responsable;
    private Date fechaSalida;
    private Date fechaLlegada;    
    
}
