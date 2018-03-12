package com.teamgp.giflib.data;

import com.teamgp.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class cagetoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
        new Category(0, "Technology")
        ,new Category(0, "People")
        ,new Category(0, "Destruction")
    );

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }

    public Category findById(int id){
        for(Category category : ALL_CATEGORIES){
            if(category.getId() == id) return category;
        }
        return null;
    }
}
