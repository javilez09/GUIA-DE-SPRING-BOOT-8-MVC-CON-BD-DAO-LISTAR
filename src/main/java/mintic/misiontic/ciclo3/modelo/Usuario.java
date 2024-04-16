/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author USUARIO
 */

@Entity
@Table (name = "usuarios")
@Data

public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id

    private String cedula;
    private String clave;
    private String nombre;
    private String email;

}
