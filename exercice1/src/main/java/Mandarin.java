import java.util.logging.Logger;

public class Mandarin implements Canard

{
    private static Logger logger = Logger.getLogger(String.valueOf(Mandarin.class));
    public void cancaner() {
        logger.info("je suis un mandarin");
    }

    public void dandiner(double distance) {
        logger.info("je suis un mandarin qui fait une distance"+distance+"m");

    }
}
