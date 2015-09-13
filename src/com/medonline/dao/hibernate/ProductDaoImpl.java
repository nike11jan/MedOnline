package com.medonline.dao.hibernate;


import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medonline.dao.OrderDao;
import com.medonline.dao.ProductDao;
import com.medonline.model.Order;
import com.medonline.model.OrderDetails;
import com.medonline.model.Product;

@Repository("ProductDao")
public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao{

	@Override
	@Transactional
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
	public List<Product> searchProduct(Product product) {
		//getHibernateTemplate().findByNamedParam("from Product where name like :name", "name",  "%"+product.getName()+"%");
		return (List<Product>) getHibernateTemplate().find("from Product where name like ?", "%"+product.getName()+"%");
		// TODO Auto-generated method stub
	//	return null;
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return (List<Product>) getHibernateTemplate().find("from Product", null);
		
	}
	public static void main(String arg[])
	{
		ApplicationContext appContext = 
		    	  new ClassPathXmlApplicationContext("Beans.xml");
		/*List<OrderDetails> ordDetails=new ArrayList<OrderDetails>();
		ordDetails.add(new OrderDetails(0, 1, 20));
		Order ord=new Order(0, new Date(), new Date(),200, 1, 123, ordDetails);*/
		((ProductDao) appContext.getBean("ProductDao")).addProducct(new Product(0, "test", "ddddddfs", 100, new Date(), new Date()));
		/*((OrderDao) appContext.getBean("OrderDao")).saveOrder(ord);*/
		//List<Product> prodList=((ProductDao) appContext.getBean("ProductDao")).getProductList();
		Product p=new Product();
		p.setName("pest");
		List<Product> prodList=((ProductDao) appContext.getBean("ProductDao")).searchProduct(p);
		System.out.println(prodList.get(0));
	}

	

}
