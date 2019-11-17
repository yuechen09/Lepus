package onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineShop.dao.CustomerDao;
import onlineShop.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao dao;
	
	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
	}
	public Customer getCustomerByUserName(String userName) {
		return dao.getCustomerByUserName(userName);
	}
}
