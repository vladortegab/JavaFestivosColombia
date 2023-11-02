package apifestivos.apifestivos.entidades;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "tipo")
public class Tipo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_tipo")
    @GenericGenerator(name = "secuencia_tipo", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "tipo", length = 100, unique = true)
    private String tipo;

    public Tipo(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    public Tipo() {
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    @JsonIgnore
    @OneToMany(mappedBy = "tipo")
    private List<Festivo> selecciones = new ArrayList<>();
    
}
