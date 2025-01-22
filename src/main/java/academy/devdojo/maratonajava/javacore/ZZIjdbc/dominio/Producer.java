package academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

@Value //ira atribuir os atributos da classe como privados
@Builder
public class Producer {
    private final Integer id;
    private final String name;
}
