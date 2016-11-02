package com.vee.dao.impl;

import java.util.List;

import com.vee.dao.BaseDAO;
import com.vee.dao.CategoryDAO;
import com.vee.model.Category;

public class CategoryDAOImpl extends BaseDAO<Category, String> implements CategoryDAO {

    public CategoryDAOImpl() {
        super(Category.class);
    }
    
    /* (non-Javadoc)
     * @see com.vee.dao.BaseDAO#read(java.io.Serializable)
     * implement join fetch to enable lazy fetching
     */
    @Override
    public Category read(String ID) {
        @SuppressWarnings("unchecked")
		List<Category> categoryList = (List<Category>) getHibernateTemplate().find("from Category cat "
                + "join fetch cat.itemList "
                + "where cat.categoryCode=?", ID);
        return categoryList.get(0);
    }
    
}
