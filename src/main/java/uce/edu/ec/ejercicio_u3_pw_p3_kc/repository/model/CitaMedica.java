package uce.edu.ec.ejercicio_u3_pw_kc.repository.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "cita_medica")
public class CitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cime_id")
    @SequenceGenerator(name= "seq_cime_id", sequenceName = "seq_cime_id", allocationSize = 1)
    @Column(name = "cime_id")
    private Integer id;

    @Column(name = "cime_numeroCita")
    private String numeroCita;

    @Column(name = "cime_fechaCita")
    private LocalDateTime fechaCita;

    @Column(name = "cime_valorCita")
    private BigDecimal valorCita;

    @Column(name = "cime_lugarCita")
    private String lugarCita;

    @Column(name = "cime_diagnostico")
    private String diagnostico;

    @Column(name = "cime_receta")
    private String receta;

    @Column(name = "cime_fechaProximaCita")
    private LocalDateTime fechaProximaCita;

    @ManyToOne
    @JoinColumn(name = "cime_id_doctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "cime_id_paciente")
    private Paciente paciente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(String numeroCita) {
        this.numeroCita = numeroCita;
    }

    public LocalDateTime getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

    public BigDecimal getValorCita() {
        return valorCita;
    }

    public void setValorCita(BigDecimal valorCita) {
        this.valorCita = valorCita;
    }

    public String getLugarCita() {
        return lugarCita;
    }

    public void setLugarCita(String lugarCita) {
        this.lugarCita = lugarCita;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public LocalDateTime getFechaProximaCita() {
        return fechaProximaCita;
    }

    public void setFechaProximaCita(LocalDateTime fechaProximaCita) {
        this.fechaProximaCita = fechaProximaCita;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
