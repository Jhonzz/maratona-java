package academy.devdojo.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest03 {
    private String name = "Jhon";
    static class Nested{
        private String lastName = "Pablo";

        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }

    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
