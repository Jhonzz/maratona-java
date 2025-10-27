package academy.devdojo.maratonajava.javacore.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Value //ira atribuir os atributos da classe como privados
@Builder
public class Producer {
    Integer id;
    String name;
}
