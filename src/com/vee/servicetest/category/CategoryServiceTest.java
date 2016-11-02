package com.vee.servicetest.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.vee.core.factory.ApplicationContextFactory;
import com.vee.model.Category;
import com.vee.services.CategoryService;
import com.vee.services.impl.CategoryServiceImpl;

public class CategoryServiceTest{

    private CategoryService categoryService;
    
    private Category mockCategory(){
        Category cat = new Category();
        cat.setCategoryCode("TestCat01");
        cat.setCategoryName("Test Category 001");
        return cat;
    }
    
    @Before
    public void init() {
        ApplicationContext applicationContext = ApplicationContextFactory.getInstance();
        categoryService = (CategoryService) applicationContext.getBean("categoryServiceImpl");
    }
    
    @Test
    public void createCategory(){
        assertNull(categoryService.read(mockCategory().getCategoryCode()));
        categoryService.create(mockCategory());
        assertNotNull(categoryService.read(mockCategory().getCategoryCode()));
        
    }

    @Test
    public void createCategory2(){
        System.out.println("actual test 2");
        assertEquals(true, true);
    }
    
    @After
    public void tearDown() {
        categoryService.delete(mockCategory());
    }
    
}
