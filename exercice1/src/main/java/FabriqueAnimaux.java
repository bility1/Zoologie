public class FabriqueAnimaux {
    private static final FabriqueAnimaux fabrique = new FabriqueAnimaux();
    public static FabriqueAnimaux getFabrique(){
        return fabrique;
    }
    public Animal creerChien(){
        return new Chien();
    }

    public Animal creerElephant(){
        return new Elephant();
    }

    public Animal creerColvert(){
        return new CanardAdapter(new Colvert());
    }
    public Animal creerMandarin(){
        return new CanardAdapter(new Mandarin());
    }
    public Animal oberver(Animal animal,ObservateurAnimal observateurAnimal){

        AnimalObservable animal1 = new AnimalObservable(animal);
        animal1.enregistrement(observateurAnimal);
        return animal1;
    }
}
