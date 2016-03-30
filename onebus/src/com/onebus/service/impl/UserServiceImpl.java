package com.onebus.service.impl;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onebus.beans.User;
import com.onebus.dao.BaseDAO;
import com.onebus.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	private BaseDAO<User> baseDAO;

	/*
	 * @Override public void saveUser(User user) { baseDAO.merge(user); }
	 * 
	 * @Override public boolean existUserWithUserName(String userName) { String
	 * hql="select count(*) from User where userName=?"; long
	 * count=baseDAO.count(hql, new Object[]{userName}); if(count>0){ return
	 * true; }else{ return false; } }
	 * 
	 * @Override public User login(User user) { List<Object> param=new
	 * LinkedList<Object>(); StringBuffer hql=new
	 * StringBuffer("from User u where u.userName=? and u.password=?");
	 * param.add(user.getUserName()); param.add(user.getPassword());
	 * if(user.getStatus()==2){ hql.append(" and u.status=2"); } return
	 * baseDAO.get(hql.toString(), param); }
	 */

	/*
	 * @Override public List<User> findUserList(User s_user, PageBean pageBean)
	 * { List<Object> param=new LinkedList<Object>(); StringBuffer hql=new
	 * StringBuffer("from User"); if(s_user!=null){
	 * if(StringUtil.isNotEmpty(s_user.getUserName())){
	 * hql.append(" and userName like ? ");
	 * param.add("%"+s_user.getUserName()+"%"); } } hql.append(" and status=1");
	 * if(pageBean!=null){ return
	 * baseDAO.find(hql.toString().replaceFirst("and", "where"), param,
	 * pageBean); }else{ return null; } }
	 * 
	 * @Override public Long getUserCount(User s_user) { List<Object> param=new
	 * LinkedList<Object>(); StringBuffer hql=new
	 * StringBuffer("select count(*) from User"); if(s_user!=null){
	 * if(StringUtil.isNotEmpty(s_user.getUserName())){
	 * hql.append(" and userName like ? ");
	 * param.add("%"+s_user.getUserName()+"%"); } } hql.append(" and status=1");
	 * return baseDAO.count(hql.toString().replaceFirst("and", "where"), param);
	 * }
	 */
	public void delete(User user) {
		baseDAO.delete(user);
	}

	/*
	 * @Override public User getUserById(int id) { return
	 * baseDAO.get(User.class, id); }
	 */

	public void saveUser(User user) {
		baseDAO.save(user);
	}

	public User login(User user) {
		return null;
	}

	public List<User> find(String username) {
		// TODO Auto-generated method stub

		String hql = "from com.onebus.beans.User where username = ?";
		String[] para = { username };
		return baseDAO.find(hql, para);
	}

	@Override
	public List<User> findByPhone(String phone) {
		String hql = "from com.onebus.beans.User where phone = ?";
		String[] para = { phone };
		return baseDAO.find(hql, para);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		baseDAO.update(user);
		
	}

	/*
	 * @Override public User login(User user) { return null; }
	 */

}
