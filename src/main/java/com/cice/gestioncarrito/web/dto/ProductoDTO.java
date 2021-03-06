package com.cice.gestioncarrito.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

    private Long idProducto;
    private Integer cantidad;
    private Double precio;
    private String imagen;
    private String descripcion;
    private String nombre;

}
