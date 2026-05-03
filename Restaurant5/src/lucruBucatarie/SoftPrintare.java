package lucruBucatarie;

public class SoftPrintare {

    public void PrinteazaFactura(){
        System.out.println(functioneazaPrinterul()?"Factura se printeaza":
                "Printerul nu functioneaza");
    }

    private boolean functioneazaPrinterul(){
        return true;
    }
}
