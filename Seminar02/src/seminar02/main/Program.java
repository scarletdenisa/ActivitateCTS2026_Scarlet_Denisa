package seminar02.main;

import seminar02.clase.Angajat;
import seminar02.clase.Aplicant;
import seminar02.clase.readers.ReaderAngajati;
import seminar02.clase.readers.ReaderAplicanti;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			ReaderAplicanti ra= new ReaderAngajati();
			listaAngajati=ra.readAplicanti("angajati.txt");
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch blk
			e.printStackTrace();
		}
	}

}
