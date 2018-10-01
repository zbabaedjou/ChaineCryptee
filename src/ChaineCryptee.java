
public class ChaineCryptee {
	private String clair;
	private int decalage;
	
	public ChaineCryptee(String clair, int decalage) {
		this.clair=clair;
		this.decalage=decalage;
	}
	
	 private static char decaleCaractere(char c, int decalage) {
	        return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
	    }
	 public String decrypte(String texte,int decal) {
		 	
		 return this.clair;
	 }
	 
	 public String crypte() {
		 String texte_cryptee="";
		 int i=0;
		 if(this.clair==null)
			 return "";
		 else {
			 while(i<this.clair.length()) {
				 texte_cryptee+=decaleCaractere(this.clair.charAt(i), this.decalage);
				 i++;
			 }
		 }
		
		 return texte_cryptee;
	 }
}
