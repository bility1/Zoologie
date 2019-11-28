import java.util.logging.Logger;

public class Colvert implements Canard {
    private static Logger logger = Logger.getLogger(String.valueOf(Colvert.class));
    public void cancaner() {
        logger.info("Je suis un colvert");
    }

    public void dandiner(double distance) {
        logger.info("je suis un colvert qui dandine "+distance);
    }
}
