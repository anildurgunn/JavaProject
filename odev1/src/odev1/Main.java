package odev1;

public class Main {

	public static void main(String[] args) {

		Kategori kategori1 =new Kategori(1,"programlama");
		
		Kategori kategori2 =new Kategori(2,"kisisel gelisim");
		
		Kategori kategori3 =new Kategori(3,"kopek Videolari");
		
		Kategori[] kategoriler = {
				
				kategori1,kategori2,kategori3
		};
		
		System.out.println(kategoriler.length);
		
		for(Kategori kategori:kategoriler) {
			
			System.out.println(kategori.name);
		}

		
		Program program1 = new Program(1,"yazilim gelistirici yeti",50,"fffffffffff");
		
		Program program2 = new Program(2,"programlamaya giris icin temel kurs",70,"tum programlama dilleri icin");

		Program[] programlamalar = {
				
				program1,program2
		};
		
		System.out.println(programlamalar.length);
		
		for(Program program:programlamalar) {
			
			System.out.println(program.name);
		}
		
		System.out.println("----------------------");
		
		
		ProgramManager programManager = new ProgramManager();
		
		programManager.goKurslarım(program1);
		programManager.goKurslarım(program2);
		
	}

}
