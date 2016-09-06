
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println((1+1+1)+" = 3");
        int i = 5;
        if (i == 3) { System.out.println(i); } else System.out.println("i ist != 3, i = "+i);
        String j;
        j = "First Test successfully!";
        System.out.println(j);
        SuperDupa();
        
        int h = ZahlAusgeben();
        h += 100;
        System.out.println(h);
        // Funktion Multiplikation aufrufen mit a * b (ohne Rückgabewert)
        multiplikation(5, 5);
        
        //Rekursion
        rekursion(42);
        
    }
    
    static void SuperDupa() {
    	System.out.println("Hiho");
    	System.out.println(100);
    }
    
    static int ZahlAusgeben() {
    	int za = 100;
    	return za;
    }
    
    static void multiplikation(int a, int b) {
    System.out.println(a * b);
    
    }
    // Rekursion
    static void rekursion(int r) {
      if (r >0 && r != 1) { 
        System.out.println("Noch " + r + " Durchläufe.");
        rekursion(r-1);
      } else { System.out.println("Das ist der letzte Durchlauf.\nFertig!"); }
    }
    
}