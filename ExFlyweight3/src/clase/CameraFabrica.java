package clase;

import java.util.HashMap;
import java.util.Map;

public class CameraFabrica {
    private Map<Integer,ICamera> camere=new HashMap<>();

    public ICamera getCamera(int prosoape, int cearsafuri, int perne, int umerase,int nrCamera){
        ICamera camera=camere.get(nrCamera);
        if(camera==null) {
            camera = new Camera(prosoape, cearsafuri, perne, umerase, nrCamera);
            camere.put(nrCamera,camera);

        }
        return camera;
    }
}
