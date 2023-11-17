public class PascalFactory implements AbstractFactory{
    public void print(){
        System.out.println("Creación de un toolkit de Pascal");
    }
    public nvccCompilador createCompilador(){
        return new nvccPascal();
    }
    public nvprofProfiler createProfiler(){
        return new nvprofPascal();
    }
    public nvvmMonTool createMonTool(){
        return new nvvmPascal();
    }
}
