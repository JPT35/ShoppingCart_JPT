import java.util.Arrays;

/**
 * An application class that maintains a shopping cart for an online store
 * @author johnpaulthomas
 *
 */
public class ShoppingApplication {

	public static void main(String[] args) {
		
		Item[] items = {new Item("Pants", 25.00),
						new Item("Shirt", 10.00),
						new Item("Shoes", 50.00),
						new Item("Hat", 5.00),
						new Item("Backpack", 75.00)};
		
		
		ShoppingCart<Item> shoppingCart = new LinkedBag<Item>();
		
		double totalCost = 0;
		
		for (int index = 0; index < items.length; index++) {
			Item nextItem = items[index];
			
			shoppingCart.add(nextItem);
			
			totalCost = totalCost + nextItem.getPrice();
		}//end for loop 
		
		while (!shoppingCart.isEmpty())
			
			System.out.println(shoppingCart.remove());
		
		
		System.out.println(Arrays.deepToString(shoppingCart.toArray()));
		System.out.println("Total Cost is: "+ totalCost);
		
		System.out.println("Cuurent Size of Shoping Cart: "+shoppingCart.getCurrentSize());
		System.out.println("Does the shopping cart have items in it? "+shoppingCart.isEmpty());
		
		System.out.println();
		
		System.out.println("Adding new item Jacket to cart: "+shoppingCart.add(new Item("Jacket", 35.00)));
		
		System.out.println(shoppingCart.add(items [2]));
		System.out.println(shoppingCart.add(items [2]));
		
		System.out.println("Removing shirt from cart "+shoppingCart.remove(items [1]));
		
		System.out.println();
		
		System.out.println(Arrays.deepToString(shoppingCart.toArray()));
		
		System.out.println("Total Cost is: "+ totalCost);
		System.out.println("Curent Size of Shoping Cart: "+shoppingCart.getCurrentSize());
		
		System.out.println();
		System.out.println("Removing first item from chain: "+shoppingCart.remove());
		
		System.out.println(Arrays.deepToString(shoppingCart.toArray()));
		System.out.println("Curent Size of Shoping Cart: "+shoppingCart.getCurrentSize());
		
		System.out.println();
		System.out.println(shoppingCart.add(new Item("Pants", 25.00)));
		System.out.println("Frequency of items[2]: "+shoppingCart.getFrequencyOf(items [2]));
		shoppingCart.clear();
		
		System.out.println(Arrays.deepToString(shoppingCart.toArray()));
	}//end main method

}//end class
