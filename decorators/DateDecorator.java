package decorators;

import java.time.LocalDate;

public class DateDecorator extends LoggerDecorator  {

    public DateDecorator(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String message) {

        message = message + ", SAUCE";

        super.log(message);
    }

}
