package com.vee.dao.impl;

import java.util.List;

import com.vee.dao.BaseDAO;
import com.vee.dao.CategoryDAO;
import com.vee.model.Category;

public class CategoryDAOImpl extends BaseDAO<Category, String> implements CategoryDAO {

    public CategoryDAOImpl() {
        super(Category.class);
    }
}
