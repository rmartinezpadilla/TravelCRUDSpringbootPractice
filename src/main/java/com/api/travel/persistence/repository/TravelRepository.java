/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.api.travel.persistence.repository;

import com.api.travel.persistence.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Equipo
 */
public interface TravelRepository extends JpaRepository<Travel, Long>{
    
}
