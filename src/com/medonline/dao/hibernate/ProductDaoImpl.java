package com.medonline.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.medonline.dao.ProductDao;
import com.medonline.model.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao{

	@Override
	public boolean addProducct(Product product) {
		// TODO Auto-generated method stub
		if(getHibernateTemplate().save(product)==null)
		return false;
		else 
			return true;
	}

	@Override
	public Product getProductByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
