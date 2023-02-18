package uce.edu.ec.ejercicio_u3_pw_p3_kc.repository.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_doct_id")
    @SequenceGenerator(name= "seq_doct_id", sequenceName = "seq_doct_id", allocationSize = 1)
    @Column(name = "doct_id")
    private Integer id;

    @Column(name = "doct_cedula")
    private String cedula;

    @Column(name = "doct_nombre")
    private String nombre;

    @Column(name = "doct_apellido")
    private String apellido;

    @Column(name = "doct_fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "doct_numero_consultorio")
    private String numeroConsultorio;

    @Column(name = "doct_codigo_senescyt")
    private String codigoSenescyt;

    @Column(name = "doct_genero")
    private String genero;

    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<CitaMedica> citasMedicas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getCodigoSenescyt() {
        return codigoSenescyt;
    }

    public void setCodigoSenescyt(String codigoSenescyt) {
        this.codigoSenescyt = codigoSenescyt;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
