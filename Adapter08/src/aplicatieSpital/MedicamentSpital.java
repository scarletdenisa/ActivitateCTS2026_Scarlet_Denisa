package aplicatieSpital;
//clasa care trebuie adaptata
public class MedicamentSpital {


    public void achizitioneazaMedicament(){
        System.out.println(prezintaReteta()?
                "Medicamentul s-a achizitionat":
                "Nu se poate achizitiona medicamentul deoarece nu exista retea");
    }

    public boolean prezintaReteta(){
        return true;
    }
}
