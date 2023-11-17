public interface AbstractFactory{
    public void print();
    public nvccCompilador createCompilador();
    public nvprofProfiler createProfiler();
    public nvvmMonTool createMonTool();

}
