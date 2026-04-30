package clase;

public class Salon {
    private boolean paturiLibere[]=new boolean[50];
    private static Salon instance;

    public static Salon getInstance(){
        if(instance==null)
            instance=new Salon();
        return instance;
    }

    private Salon(){
        this.paturiLibere[1]=true;
        this.paturiLibere[2]=true;
        this.paturiLibere[5]=true;
        this.paturiLibere[12]=true;
        this.paturiLibere[25]=true;
        this.paturiLibere[26]=true;
    }

    public int nrPatLiber(){
        for(int i=0;i< paturiLibere.length;i++){
            if(paturiLibere[i]==true)
                return i;
        }
        return -1;
    }

    public void ocupaPat(int i){
        this.paturiLibere[i]=false;
    }
}
