
package Project;

import java.util.ArrayList;


public class Category {
    private String Category;
    ArrayList <String> Sub ;
    int nbreOfSubcategories = 0;

    public Category(String Category) {
        this.Category = Category;
    }

    public void addSubCategory(String subCategory){
    
            if (nbreOfSubcategories<4){
                Sub.add(subCategory);
                nbreOfSubcategories++;
            }
            else {
                System.out.print("Maximum Number of subcategories is 4");
            }
            
    
    }
    public void removeSubCategory(String subCategory){
    
                Sub.remove(subCategory);
                nbreOfSubcategories--;
            
    }
    
    
    
}
