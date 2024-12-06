package academy.devdojo.maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest01 {
    private String name = "Okarun";

    class Inner{
        public void printOuterClassesAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassesAttribute();
        inner2.printOuterClassesAttribute();
    }
}
