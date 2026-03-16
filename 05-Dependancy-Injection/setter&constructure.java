@Component
class Car {
    // Bắt buộc, vì xe thì phải có động cơ
    private Engine engine;

    // Tùy chọn, vì xe có thể không có người chủ
    private Human owner;

    // Do engine bắt buộc, nên dùng constructor based injection
    // Constructor based có thể inject nhiều dependency cùng lúc
    public Car(Engine engine) {
        this.engine = engine;
    }

    // Do owner là tùy chọn, nên dùng setter based injection
    // Setter based chỉ inject một dependency mỗi setter
    public void setOwner(Human owner) {
        this.owner = owner;
    }
}
