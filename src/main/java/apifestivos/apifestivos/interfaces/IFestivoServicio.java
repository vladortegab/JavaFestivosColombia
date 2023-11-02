package apifestivos.apifestivos.interfaces;

import java.util.Date;
import java.util.List;

import apifestivos.apifestivos.entidades.dtos.FestivoDto;

public interface IFestivoServicio {

    public List<FestivoDto> obtenerFestivos(int año);

    public boolean esFestivo(Date fecha);
    public boolean esFechaValida(String strFecha);


    
}
