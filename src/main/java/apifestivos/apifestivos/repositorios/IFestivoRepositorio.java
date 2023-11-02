package apifestivos.apifestivos.repositorios;

//import apifestivos.apifestivos.dtos.FestivoDto;
import apifestivos.apifestivos.entidades.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IFestivoRepositorio extends JpaRepository<Festivo, Integer> {
    @Query("SELECT f FROM Festivo f WHERE YEAR(f.fecha) = :año")
    List<Festivo> obtenerFestivos(@Param("año") int year);
    
    
}
