public class TeslaFactory implements AbstractFactory{
    public void print(){
        System.out.println("Creación de un toolkit de Tesla");
    }
    public nvccCompilador createCompilador(){
        return new nvccTesla();
    }
    public nvprofProfiler createProfiler(){
        return new nvprofTesla();
    }
    public nvvmMonTool createMonTool(){
        return new nvvmTesla();
    }
}
