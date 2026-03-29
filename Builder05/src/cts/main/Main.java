package cts.main;


import cts.builder.Internare;
import cts.builder.InternareBuilder;
import cts.builder.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {

        Internare internare1=new Internare(true,true,false,false,"Ana");
        Internare internare2=new Internare(false,false,false,false,"Ionut");

        InternareBuilder builder=new InternareBuilder("Denisa");
        Internare internare3=builder.build();
        //Internare internare4=builder.setNume("Alin").setPapuci(true).setHalat(true).build();

        System.out.println(internare1.toString());
        System.out.println(internare2.toString());
        System.out.println(internare3.toString());
        //System.out.println(internare4.toString());

        InternareBuilderAlternativ builderAlternativ=new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);

        Internare internare101=builderAlternativ.build("Ion");
        Internare internare102=builderAlternativ.build("Georgescu"); //build returneaza internarea
        Internare internare103=builderAlternativ.build("Alexia");

        internare103.setNume("Alex");

        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());
    }
}