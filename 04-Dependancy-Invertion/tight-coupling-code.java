// 1. Không có Interface IFuel. Chỉ có class cụ thể.
class HighOctaneFuel {
    public void burn() {
        System.out.println("High Octane Fuel: Unleashing maximum performance!");
    }
}

// 2. Lớp Động cơ tự "new" loại xăng cụ thể bên trong nó
class MercedesEngine {
    // VI PHẠM: Engine bị dính chặt vào HighOctaneFuel
    private HighOctaneFuel fuel = new HighOctaneFuel();

    public void start() {
        System.out.println("Mercedes Engine: Running...");
        fuel.burn();
    }
}

// 3. Lớp Xe đua tự "new" loại động cơ cụ thể
class F1Car {
    // VI PHẠM: F1Car bị dính chặt vào MercedesEngine
    private MercedesEngine engine = new MercedesEngine();

    void race() {
        engine.start();
        System.out.println("F1 Car is racing!");
    }
}

// 4. Cách sử dụng
// public class Main {
//     public static void main(String[] args) {
//         F1Car car = new F1Car();
//         car.race();
//     }
// }