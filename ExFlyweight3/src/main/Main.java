package main;

import clase.CameraFabrica;
import clase.ICamera;
import clase.State;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        State state=new State("Aurel");
        State state1=new State("Ioana");

        CameraFabrica fabrica=new CameraFabrica();
        ICamera camera=fabrica.getCamera(2,2,2,2,2);
        camera.afiseazaDetalii(state);
        camera.afiseazaDetalii(state1);
    }
}