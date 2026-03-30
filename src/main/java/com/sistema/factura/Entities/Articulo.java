package com.sistema.factura.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "El nombre del artículo no puede ser vacío")
    private String nombre;
    private String descripcion;
    @NotBlank(message = "El precio del artículo no puede ser vacío")
    private Double precio_unitario;
    @NotBlank(message = "El stock del artículo no puede ser vacío")
    private Integer stock;
}
