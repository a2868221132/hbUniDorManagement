/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.sys.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.sys.entity.Post;

/**
 * 岗位管理DAO接口
 * @author st
 * @version 2017-03-25
 */
@MyBatisDao
public interface PostDao extends CrudDao<Post> {

}
