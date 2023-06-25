
package com.portfolio.vp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


/*
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;*/



@Getter @Setter
@Entity
public class Persona {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple longitud")
    private String img;
}