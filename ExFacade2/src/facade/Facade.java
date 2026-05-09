package facade;

import clase.Camera;
import clase.PlecareClient;
import clase.Prosoape;

public class Facade {
    public void verificaCamera(Camera camera){
        if(camera.getNrCamera()<10){
            PlecareClient plecare=new PlecareClient();
            if(plecare.verificareCuratenie(camera.getNrCamera())){
                Prosoape prosoape=new Prosoape();
                if (prosoape.existaProsoape(camera.getNrCamera()))
                    System.out.println("Camera cu numarul "+
                            camera.getNrCamera()+" este libera, a fost curatata si are prosoape");
                else
                    System.out.println("Camera cu numarul "+
                            camera.getNrCamera()+" este libera, a fost curatata, dar nu are prosoape");
            }else System.out.println("Camera cu numarul "+
                    camera.getNrCamera()+" este libera, dar nu a fost curatata si nu are prosoape");
        }else
            System.out.println("Camera cu numarul "+
                    camera.getNrCamera()+" nu este libera, nu a fost curatata si nu are prosoape");
    }
}
