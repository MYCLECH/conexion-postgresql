package edu.cibertec.pc3mongo.document;

import edu.cibertec.pc3mongo.dto.Ubigeo;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document
@Data
public class Proveedor {

    @Id
    @Field(name = "idproveedor")
    private String idProveedor;

    @Field(name = "razonsocial")
    private String razonSocial;

    private String ruc;

    private String direccion;

    private String telefono;

    private String celular;

    private String contacto;

    private String estado;

    @Field(name = "fecharegistro")
    private LocalDateTime fechaRegistro;

    private Ubigeo ubigeo;
}
