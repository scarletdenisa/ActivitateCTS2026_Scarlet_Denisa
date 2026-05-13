package clase;

public class Facade {
    public void verificaMasa(Masa m){
        if(m.getNrPersoane()==0){
            if(m.getOreDeLaPlecareaUltimuluiClient()>=2){
                if(m.getNrServetele()>=10){
                    System.out.println("Masa cu id "+
                            m.getIdMasa()+" este libera");
                }else System.out.println("Masa cu id "+
                        m.getIdMasa()+" nu are servetele noi");
            }else System.out.println("Masa cu id "+
                    m.getIdMasa()+" nu are servetele noi si nici nu e debarasata");
        }else System.out.println("Masa cu id "+
                m.getIdMasa()+" nu are servetele noi, nu e debarasata si nici nu e libera");
    }
}
