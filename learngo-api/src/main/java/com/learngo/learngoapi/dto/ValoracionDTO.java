package com.learngo.learngoapi.dto.model

import lombok.Data;

@Data
public class ValoracionDTO {
    private Integer calificacion;
    private String comentario;
    private String nombreAlumno;
}