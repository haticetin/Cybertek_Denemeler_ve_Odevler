package Assignments.Assignment14.Q14;

import java.util.ArrayList;
import java.util.List;


public class TJMaxx {

	
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    
    public TJMaxx() {
    	
        regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    
    public void addRegularItem(Item item) {
       
       regularItems.add(item);
    }

    
    public void addOnSaleItem(OnSaleItem item) {
        
        onSaleItems.add(item);
    }

    
    public List<Item> getRegularItems() {
         
        return regularItems;
    }

    
    public List<OnSaleItem> getOnSaleItems() {
         
        return onSaleItems;
    }

    
    public int regularItemsCount() {
          
        return regularItems.size();
    }

    
    public int onSaleItemsCount() {
        //TODO change from -1 
        return onSaleItems.size();
    }

    
    public List<String> getAllItemNames() {
    	
    	List<String> allItems = new ArrayList<>();
       
       for(Item regName : regularItems) {
    	   allItems.add(regName.getName());
       }
       
       for(Item onSName : onSaleItems) {
    	   allItems.add(onSName.getName());
       }
       
       return allItems;
    }

    
    public double getItemPrice(int catalogNumber){
       
    	for(Item regItem : regularItems) {
    		if(regItem.getCatalogNumber()==catalogNumber) {
    			return regItem.getPrice();
    		}
    	}
    	
    	for(Item onSItem : onSaleItems) {
    		if(onSItem.getCatalogNumber()==catalogNumber) {
    			return onSItem.getPrice();
    		}
    	}
    	
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name){
        
        for(Item onSItem : onSaleItems) {
        	if(onSItem.equals(name)) {
        		return getOnSaleItem(name);
        	}
        }
        
        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        
    	for(Item regItem : regularItems) {
    		if(regItem.getCatalogNumber()==catalogNumber) {
    			regularItems.remove(catalogNumber);
    		}
    	}
    	
    	for(Item onSItem : onSaleItems) {
    		if(onSItem.getCatalogNumber()==catalogNumber) {
    			onSaleItems.remove(catalogNumber);
    		}
    	}
    	
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
       
    	for(Item regItem : regularItems) {
    		if(regItem.getCatalogNumber()==catalogNumber) {
    			regItem.setQuantity(regItem.getQuantity()-1);
    		}
    	}
    	
    	for(Item onSItem : onSaleItems) {
    		if(onSItem.getCatalogNumber()==catalogNumber) {
    			onSItem.setQuantity(onSItem.getQuantity()-1);    		}
    	}
       
       
       
    }


}
