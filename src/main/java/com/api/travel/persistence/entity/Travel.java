/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.travel.persistence.entity;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Equipo
 */
@Data
@Entity
@Table(name = "travel") 
public class Travel {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String ciudadSalida;
    private String ciudadLlegada;
    private String contenido;
    private String responsable;
    private Date fechaSalida;
    private Date fechaLlegada;
    private LocalDateTime fechaCreacion;
    private TravelStatus travelStatus;
    
}
