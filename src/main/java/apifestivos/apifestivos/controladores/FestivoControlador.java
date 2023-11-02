package apifestivos.apifestivos.controladores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import apifestivos.apifestivos.interfaces.IFestivoServicio;

@RestController
@RequestMapping("/festivos")
public class FestivoControlador {

   @Autowired
    private IFestivoServicio festivoServicio;

    @GetMapping("/verificar")
    public String esFestivo(@RequestParam String fecha) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); // Hacer que el analizador sea estricto con el formato

        try {
            Date date = dateFormat.parse(fecha);

            if (festivoServicio.esFestivo(date)) {
                return "Es Festivo";
            } else {
                return "No es festivo";
            }
        } catch (ParseException e) {
            return "Fecha No válida";
        }
    }



}
