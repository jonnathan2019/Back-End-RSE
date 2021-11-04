
package com.sinfloo.ejemplo01.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {
    
    @Id
    @Column (name = "Empresa_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Empresa_ID;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "sector_tipo")
    private String sector_tipo;
    @Column (name = "numero_empleados")
    private int numero_empleados;
    @Column (name = "RUC_empresa")
    private String RUC_empresa;
    
    @JsonIgnore
    @OneToOne (mappedBy = "empresa")
    private Encuestado encuestado;

    public int getEmpresa_ID() {
        return Empresa_ID;
    }

    public void setEmpresa_ID(int Empresa_ID) {
        this.Empresa_ID = Empresa_ID;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector_tipo() {
        return sector_tipo;
    }

    public void setSector_tipo(String sector_tipo) {
        this.sector_tipo = sector_tipo;
    }

    public int getNumero_empleados() {
        return numero_empleados;
    }

    public void setNumero_empleados(int numero_empleados) {
        this.numero_empleados = numero_empleados;
    }

    public String getRUC_empresa() {
        return RUC_empresa;
    }

    public void setRUC_empresa(String RUC_empresa) {
        this.RUC_empresa = RUC_empresa;
    }

    public Encuestado getEncuestado() {
        return encuestado;
    }

    public void setEncuestado(Encuestado encuestado) {
        this.encuestado = encuestado;
    }
    
    
    
}
