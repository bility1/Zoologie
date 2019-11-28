import java.util.logging.Logger;

public class Elephant implements Animal {
    private static Logger logger = Logger.getLogger(String.valueOf(Elephant.class));
    public void faireDuBruit() {
        logger.info("je suis un elephant blanc qui barrit");
    }

    public void avance(double distance) {
        logger.info("j'essaie de me deplacer a une distance"+distance+"m");
    }
}
