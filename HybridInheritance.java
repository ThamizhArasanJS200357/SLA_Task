package myproject;

class Ingredient{
	public void getIngredient() {
		System.out.println("Ingredients");
	}
}

class ItalianDish extends Ingredient{
	public void makeItalian() {
		System.out.println("Italiandish");
	}
	
}
class MexicanDish extends Ingredient{
	public void makeMexican() {
		System.out.println("Mexicandish");
	}
	
}
class FusionDish extends MexicanDish{
	public void makeFusion() {
		System.out.println("Fusiondish");
	}
	
}
public class HybridInheritance {

	public static void main(String[] args) {
		FusionDish fr=new FusionDish();
		fr.getIngredient();
		//fr.makeMexican();
		
	}

}
