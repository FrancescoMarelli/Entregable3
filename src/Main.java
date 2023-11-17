
public class Main {
    public static void main(String[] args) {

        AbstractFactory[] factories = {new PascalFactory(), new FermiFactory(), new TeslaFactory()};

        // Recorre cada fábrica y crea  ToolKit para cada familia
        for (AbstractFactory factory : factories) {
            generarToolKit(factory);
        }
    }

    public static void generarToolKit(AbstractFactory factory) {
        factory.print();
        nvccCompilador compilador = factory.createCompilador();
        nvprofProfiler profiler = factory.createProfiler();
        nvvmMonTool monTool = factory.createMonTool();
        System.out.println("\n");
    }
}
