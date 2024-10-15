package academy.devdojo.maratonajava.javacore.Minterfaces.domain;
//Todos os metodos são public e abstract
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

        public static void retrieveMaxDataSize(){
            System.out.println("Dentro do retrieveMaxDataSize na interface");

    }
}
