package com.dao.daoImpl;


import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.baseDao.BaseDaoImpl;
import com.dao.UserDao;
import com.entity.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User, Integer> implements UserDao 
{
	public void saveUser(User user)
	{
		super.save(user);
	}

	public User getUser(String userName) {
		/*String sql = "select * from tb_user where name = " + userName;
		Query query = getCurrentSession().createQuery(sql);
		return query.*/
		return null;
	}
}
