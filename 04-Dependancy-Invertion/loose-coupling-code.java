// F1Car depends  directly on V6Engine, so we creat an interface IEngine to decouple them. F1Car will depend on IEngine, and V6Engine will implement IEngine. 
// This way, F1Car doesn't need to know about the specific implementation of the engine, and we can easily swap out different engine types without modifying F1Car.
interface IEngine {
    void start();
}

// Here we have a V6Engine that implements IEngine.
class V6Engine implements IEngine {
    public void start() {
        System.out.println("V6 Engine: Roaring!");
    }
}
// We can also have a V8Engine that implements IEngine.
class V8Engine implements IEngine {
    public void start() {
        System.out.println("V8 Engine: Thunderous!");
    }
}

class F1Car {
    private IEngine engine;

    public F1Car() {
        // VẪN VI PHẠM: F1Car vẫn phải biết cụ thể V6Engine là gì để "new" nó.
        this.engine = new V6Engine(); 
    }

    void race() {
        engine.start();
    }
}