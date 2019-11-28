public class ObservateurAnimalImpl implements ObservateurAnimal {
    public long getCmpt() {
        return cmpt;
    }

    private long cmpt =0;
    public void noitifier() {
        cmpt++;
    }

}
