package com.capgemini.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bookstore.bean.Customer;
import com.capgemini.bookstore.dao.CustomerRepository;
import com.capgemini.bookstore.exception.CustomerException;




@Service
public class CustomerServiceImpl implements CustomerService {
@Autowired
private CustomerRepository custdao;
	
	@Override
	public List<Customer> getAllCustomers() throws CustomerException {
		
		try {
			return custdao.findAll();
		} catch (Exception e) {
			throw new CustomerException(e.getMessage());
		}
	}

	

	@Override
	public List<Customer> deleteCustomer(int id) throws CustomerException {
		  if(custdao.existsById(id)) {
			  custdao.deleteById(id);
			  return getAllCustomers();
		  }else {
			  throw new CustomerException("cannot delete.Customer with Id"+id+"does not exist");
		  }
	}



	@Override
	public List<Customer> addCustomer(Customer customer) throws CustomerException {
		try {
			custdao.save(customer);
			
			
			 long millis=System.currentTimeMillis();  
			 java.sql.Date date=new java.sql.Date(millis);     
		
			 customer.setRegisterDate(date); 
			 System.out.println(customer);     
			 custdao.save(customer);   
			

			 return getAllCustomers();
		
		} 
		catch (Exception e) 
		{
			throw new CustomerException(e.getMessage());
		}
	}



	@Override
	public List<Customer> updateCustomer( Customer customer,int id) throws CustomerException {
	
		if(custdao.existsById(id)) {
			   // custdao.delete(customer);
			    custdao.save(customer);
			return getAllCustomers();
		}else {
			  throw new  CustomerException ("Invalid Customer,cannot be updated");
		}
	}



	@Override
	public Customer getCustomerById(int id) throws CustomerException {
		try {
			Optional<Customer> data= custdao.findById(id);
			if(data.isPresent()) {
				return data.get();
			}
			else {
				throw new CustomerException("customer with Id "+id+"does not match");
			}
		} catch (Exception e) {
			throw new CustomerException(e.getMessage());
		}
	}
	@Override
    public Customer login(String email, String password) throws CustomerException {
    
        Customer customer = custdao.getByEmail(email);
        System.out.println(customer);
        System.out.println(customer.getPassword());
        System.out.println(password);
        if(customer.getPassword().equalsIgnoreCase(password)) {
            return customer;
        }
        else {
            return null;
        }


	}



	@Override
	public Customer getByEmail(String email) throws CustomerException {
		
		return custdao.getByEmail(email);
	}

}
