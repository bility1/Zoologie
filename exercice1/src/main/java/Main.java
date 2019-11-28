import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ObservateurAnimalImpl observateurAnimal = new ObservateurAnimalImpl();
        FabriqueAnimaux fabriqueAnimaux = FabriqueAnimaux.getFabrique();
        Animal rantaplan = fabriqueAnimaux.creerChien();
        Animal babar = fabriqueAnimaux.creerElephant();
        Animal donald = fabriqueAnimaux.oberver(fabriqueAnimaux.creerColvert(),observateurAnimal);
        Animal picsou = fabriqueAnimaux.oberver(fabriqueAnimaux.creerMandarin(),observateurAnimal);



        Collection<Animal> lesanimaux = new ArrayList<Animal>();
        lesanimaux.add(rantaplan);
        lesanimaux.add(babar);

        lesanimaux.add(donald);
        lesanimaux.add(picsou);

        for (Animal animal: lesanimaux){
            animal.faireDuBruit();
        }
        System.out.println("il y'a "+(observateurAnimal.getCmpt()*200)+" "+"qui ont été compté selon la police");
    }
}
