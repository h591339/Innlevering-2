package no.hvl.dat100;

public class Lab5Oppgave6 {

	public static void main(String[] args) {
		int[] Tabelldata= {3,35,23,10};
		int[] Tabelldata2= {9,88,76,58};
		
		// Oppgave 6a
		System.out.println("Oppgave 6a \n");
		skrivUt(Tabelldata);
		System.out.println("_____________________________\n");
		
		
		// Oppgave 6b
		System.out.println("Oppgave 6b");
		tilStreng(Tabelldata);
		System.out.println("\n_____________________________\n");
		
		
		// Oppgave 6c
		System.out.println("Oppgave 6c");
		summer(Tabelldata);
		System.out.println();
		summer1(Tabelldata);
		System.out.println();
		summer2(Tabelldata);
		System.out.println("_____________________________\n");
		
		
		//Oppgave 6d 
		System.out.println("Oppgave 6d");
		int nummer = 35; 
		boolean result = finnesTall(Tabelldata,nummer);
		System.out.println(result);
		System.out.println("_____________________________\n");
		
		
		//Oppgave 6e
		System.out.println("Oppgave 6e");
		int target = 23;
		posisjonTall(Tabelldata,target);
		System.out.println("_____________________________\n");
		
		
		//Oppgave 6f
		System.out.println("Oppgave 6f");
		reverser(Tabelldata);
		System.out.println("_____________________________\n");
		
		
		//Oppgave 6g
		System.out.println("Oppgave 6g");
		System.out.println(erSortert(Tabelldata));
		System.out.println("_____________________________\n");
		
		
		//Oppgave 6h
		System.out.println("Oppgave 6h");
		settSammen(Tabelldata2,Tabelldata);
		System.out.println("_____________________________\n");
		
		// TODO Auto-generated method stub

	}
	
	
	
	// Oppgave 6a
	public static void skrivUt (int[] tabell) {
		
		
		
		for ( int i = 0; i<tabell.length; i++) {
			System.out.println(tabell[i]);
		}
		return;

	}
	
	
	// Oppgave 6b
	public static String tilStreng (int[] tabell) {
		
		
	System.out.print("\"[");
			for ( int i = 0; i<2; i++) {
				System.out.print(" "+tabell[i]+",");
		}
			System.out.print(" "+tabell[2]+" ]\"");
			return null;

	}
	

	

	// Oppgave 6c
	
	// For løkke
	public static void summer (int[] tabell) {
		int sum = 0;
		
		
	
			for ( int i = 0; i<tabell.length; i++) {
				sum+=tabell[i];
				System.out.println(tabell[i]);
		}
			System.out.println("For løkke metode summert: " + sum);
			return;

	}
	
	// While metode
	public static void summer1 (int[] tabell) {
		int sum = 0; 
		 
		int i = 0;
		
		while (i<tabell.length) {
			
			System.out.println(tabell[i]);
			sum = sum+tabell[i];
			i++;
			
		}
		System.out.println("While metode summert: " + sum);
		return;
	}
	
	//Utvidet for løkke
	public static void summer2 (int[] tabell) {
		int sum = 0;
		for (int a : tabell) {
			System.out.println(a);
			sum+=a;
		}
		System.out.println("Utvidet For metode summert: " + sum);
		return;
	}
	
	
	//Oppgave 6d 
	
	public static boolean finnesTall (int[] tabell, int tall) {
		
		for ( int i = 0; i<tabell.length; i++) {
			if (tabell[i] >= tall) {
				return true;
			}
			
		}
		return false;
		
	}
	
	// Oppgave 6e
	public static int posisjonTall (int[] tabell, int tall) {
		int førsteindex = -1;
		
		
		for ( int i = 0; i<tabell.length; i++) {
			if (tabell[i] == tall && førsteindex == -1) {
				førsteindex = i; 
				
			}
			if(tabell[i] == tall && førsteindex != -1) {
				førsteindex = i; 
				
			System.out.println("Posisjonen på ønsket tall er: " + førsteindex);
		}
	
		
	}
		return tall;
	
	}
	
	// oppgave 6f
	public static int[] reverser(int[] tabell) {
		
		for ( int i = 0; i<tabell.length; i++) {
			System.out.println(tabell[i]);
		}	
		for ( int i = 0; i<tabell.length/2; i++) {
			int temp = tabell[i];
			tabell[i] = tabell[tabell.length - i -1];
			tabell[tabell.length - i -1] = temp;
			}
	for ( int i = 0; i<tabell.length; i++) {
		System.out.println(tabell[i]);
	}
		return null;
	}
	
	
	
	// oppgave 6g
	public static boolean erSortert(int[] tabell) {
		
		
		int j = 0; 
		boolean sortert = true; 
		while (sortert && j<tabell.length - 1 ) {
			if ( tabell[j]>tabell[j+1]) {
				sortert = false;
			}
			j++;
		}
		
		return sortert;
		
		
	}
	
	
	// oppgave 6h
		public static int[] settSammen(int[] tabell1,int[] tabell2) {
			int nyLengde=tabell1.length+tabell2.length;
			int[]nyTab= new int[nyLengde];
			for(int i=0; i<tabell1.length; i++) {
				nyTab[i]=tabell1[i];
				System.out.println(tabell1[i]);
			}
			for(int j=0; j< tabell2.length; j++) {
				nyTab[tabell1.length+j]= tabell2[j];
				System.out.println(tabell2[j]);
			}
				return nyTab;
			}
	
}


	