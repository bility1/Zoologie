public class AnimalObservable implements Animal,AnimalObserve {
    Animal animal;
    ObservateurAnimal observateurAnimal;
    public void faireDuBruit() {
    observateurAnimal.noitifier();
    animal.faireDuBruit();
    }
    public AnimalObservable (Animal animal){
        this.animal = animal;
    }
    public void avance(double distance) {
        animal.avance(distance);
    }

    public void enregistrement(ObservateurAnimal o) {
        this.observateurAnimal=o;
    }
}
