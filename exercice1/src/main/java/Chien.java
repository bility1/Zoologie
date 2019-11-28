import java.util.logging.Logger;

public class Chien implements Animal {
    private static Logger logger = Logger.getLogger(String.valueOf(Chien.class));
    public void faireDuBruit() {
        logger.info("je suis un chien qui aboie");
    }

    public void avance(double distance) {
        logger.info("je suis un chien qui parcourt une distance"+distance+"m");

    }
}
