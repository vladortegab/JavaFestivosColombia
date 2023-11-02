package apifestivos.apifestivos.entidades.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoDto {

    private int id;

    private String tipo;

    private FestivoDto festivo;

}
