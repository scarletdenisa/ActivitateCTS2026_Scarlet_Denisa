package main;

import clase.Camera;
import facade.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Camera camera1=new Camera(11);
        Camera camera3=new Camera(5);
        Camera camera2=new Camera(6);
        Camera camera4=new Camera(9);

        Facade facade=new Facade();
        facade.verificaCamera(camera1);
        facade.verificaCamera(camera2);
        facade.verificaCamera(camera3);
        facade.verificaCamera(camera4);
    }
}