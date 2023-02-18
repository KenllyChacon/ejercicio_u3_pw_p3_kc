package uce.edu.ec.ejercicio_u3_pw_p3_kc.repository.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paci_id")
    @SequenceGenerator(name= "seq_paci_id", sequenceName = "seq_paci_id", allocationSize = 1)
    @Column(name = "paci_id")
    private Integer id;

    @Column(name = "paci_cedula")
    private String cedula;

    @Column(name = "paci_apellido")
    private String apellido;

    @Column(name = "paci_fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "paci_codigo_seguro")
    private String codigoSeguro;

    @Column(name = "paci_estatura")
    private Float estatura;

    @Column(name = "paci_peso")
    private Float peso;

    @Column(name = "paci_genero")
    private String genero;

    @OneToMany(mappedBy = "paciente",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
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

    public String getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(String codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public Float getEstatura() {
        return estatura;
    }

    public void setEstatura(Float estatura) {
        this.estatura = estatura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
