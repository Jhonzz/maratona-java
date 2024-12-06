package academy.devdojo.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest02 {
    private String name = "momo";

    void print(String param){
        final String lastName = "Ye";
        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print("");
    }
}
