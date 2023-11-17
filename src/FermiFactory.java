public class FermiFactory implements AbstractFactory{
    public void print() {
        System.out.println("Creación de un toolkit de Fermi");
    }
    public nvccCompilador createCompilador(){
        return new nvccFermi();
    }
    public nvprofProfiler createProfiler(){
        return new nvprofFermi();
    }
    public nvvmMonTool createMonTool(){
        return new nvvmFermi();
    }
}
