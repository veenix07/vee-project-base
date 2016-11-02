package com.vee.dao.impl;

import com.vee.dao.BaseDAO;
import com.vee.dao.IDAO;
import com.vee.model.Role;

public class RoleDAOImpl extends BaseDAO<Role, String> implements IDAO<Role, String> {

    public RoleDAOImpl() {
        super(Role.class);
    }

}
