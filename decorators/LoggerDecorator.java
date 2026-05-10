package decorators;

public class LoggerDecorator implements Logger {

    private Logger decoratedComponent;

    public LoggerDecorator(Logger decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public void log(String message) {
        System.out.println("--------------------------------");
        System.out.println("Another Processes...");

        decoratedComponent.log(message);
    }

}
