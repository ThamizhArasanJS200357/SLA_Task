package myproject;

class Recipe{
	public void getIngredients() {
		System.out.println("This is the Recipe");
	}
	public void getInstructions() {
		System.out.println("This is the Instruction");
	}
}

class PastaRecipe extends Recipe{
	
	public void getIngredients() {
		System.out.println("Ingredients are pasta,oil,masala,onion and tomato");
	}
	public void getInstructions() {
		System.out.println("Cook the Pasta");
	}
}

class CakeRecipe extends Recipe{
	public void getIngredients() {
		System.out.println("Ingredients are egg,powder,ghee,yeast");
	}
	public void getInstructions() {
		System.out.println("Bake");
	}
}

class SaladRecipe extends Recipe{
	public void getIngredients() {
		System.out.println("Ingredients are vegetables");
	}
	public void getInstructions() {
		System.out.println("Cooked");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		PastaRecipe pr=new PastaRecipe();
		CakeRecipe cr=new CakeRecipe();
		SaladRecipe sr=new SaladRecipe();
		System.out.println("Pasta Recipe :-");
		pr.getIngredients();
		pr.getInstructions();
		System.out.println("Cake Recipe :-");
		cr.getIngredients();
		cr.getInstructions();
		System.out.println("Salad Recipe :-");
		sr.getIngredients();
		sr.getInstructions();	
	}

}
