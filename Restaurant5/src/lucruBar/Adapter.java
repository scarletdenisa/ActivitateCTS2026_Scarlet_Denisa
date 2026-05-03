package lucruBar;

import lucruBucatarie.SoftPrintare;

public class Adapter extends SoftBar {
    private SoftPrintare soft;

    public Adapter(SoftPrintare soft) {
        this.soft = soft;
    }

    @Override
    public void integrareSoftBar(){
        soft.PrinteazaFactura();
    }
}
