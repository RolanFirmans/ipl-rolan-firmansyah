public class Car {
    private final EngineInterface engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}