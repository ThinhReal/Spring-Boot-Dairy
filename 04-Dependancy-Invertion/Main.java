// Abstraction (Trừu tượng)
interface IEngine {
    void start();
}

interface IFuel {
    void burn();
}

// Low-level modules (Details)
class MercedesEngine implements IEngine {
    private IFuel fuel;
    
    public MercedesEngine(IFuel fuel) {
        this.fuel = fuel;
    }
    public void start() {
        System.out.println("Mercedes Engine: High reliability power!");
        fuel.burn();
    }
}

class HondaEngine implements IEngine {
    private IFuel fuel;

    public HondaEngine(IFuel fuel) {
        this.fuel = fuel;
    }
    public void start() {
        System.out.println("Honda Engine: Maximum speed reached!");
        fuel.burn();
    }
}

class HybridFuel implements IFuel {
    public void burn() {
        System.out.println("Hybrid Fuel: Efficient and eco-friendly!");
    }
}

class HighOctaneFuel implements IFuel {
    public void burn() {
        System.out.println("High Octane Fuel: Unleashing maximum performance!");
    }
}
// High-level module (Hoàn toàn độc lập với chi tiết)
class F1Car {
    // F1Car chỉ biết về IEngine, không quan tâm đến loại động cơ cụ thể nào. Điều này tạo ra sự loose coupling.
    private IEngine engine;
   
    // Dependency Injection qua Constructor
    // Xe không quan tâm động cơ nào, miễn là nó tuân thủ IEngine
    public F1Car(IEngine engine) {
        this.engine = engine;

    }
    void race() {
        engine.start();
        System.out.println("F1 Car is pushing the limits!");
    }
}

// Cách sử dụng (Main)
public class Main {
    public static void main(String[] args) {
        // Chuẩn bị nhiên liệu cho 2 xe đua
        IFuel hybridFuel = new HybridFuel();
        IFuel highOctaneFuel = new HighOctaneFuel();

        // Tạo động cơ cho 2 xe đua với nhiên liệu khác nhau, nhưng cả 2 đều tuân thủ IEngine
        IEngine mercedesEngine = new MercedesEngine(highOctaneFuel);
        IEngine hondaEngine = new HondaEngine(hybridFuel);

        // Tạo xe, khi tạo thì gắn động cơ vào (qua constructor)
        F1Car KimiCar = new F1Car(mercedesEngine);
        F1Car ThinhCar = new F1Car(hondaEngine);

        // Đua
        KimiCar.race();
        ThinhCar.race();
    }
}