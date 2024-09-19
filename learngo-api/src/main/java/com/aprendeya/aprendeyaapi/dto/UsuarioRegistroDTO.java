package com.aprendeya.aprendeyaapi.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UsuarioRegistroDTO {
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private String tipoUsuario; // Enum como String
    private String grado; // Solo para estudiantes
    private String descripcion; // Solo para estudiantes
    private Integer idAlumno; // Solo para familiares, ID del alumno asociado
    private String especialidad; // Solo para docentes
    private Integer experiencia; // Solo para docentes
    private BigDecimal tarifaBase; // Solo para docentes
}
