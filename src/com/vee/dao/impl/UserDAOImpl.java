package com.vee.dao.impl;

import com.vee.dao.BaseDAO;
import com.vee.dao.IDAO;
import com.vee.model.User;

public class UserDAOImpl extends BaseDAO<User, String> implements IDAO<User, String> {

    public UserDAOImpl() {
        super(User.class);
    }

}
