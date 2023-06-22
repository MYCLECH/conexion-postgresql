package edu.cibertec.pc3mongo.document;

import edu.cibertec.pc3mongo.dto.Ubigeo;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document
@Data
public class Cliente {

    @Id
    @Field(name = "idcliente")
    private String idCliente;

    private String nombres;

    private String apellidos;

    @Field(name = "fechanacimiento")
    private LocalDate fechaNacimiento;

    private String dni;

    private String correo;

    @Field(name = "fecharegistro")
    private LocalDateTime fechaRegistro;

    private String direccion;

    private Boolean estado;

    private Ubigeo ubigeo;
}
