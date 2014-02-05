package com.gcit.lms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.gcit.lms.entities.Author;
import com.gcit.lms.entities.Publisher;

public class AdminService {
	
	private HibernateTemplate template;
	
//	public AdminService(HibernateTemplate temp) {
//		this.template = temp;
//	}

	@Transactional
	public void insertUpdate (Object obj) throws Exception{
		try{
			template.merge(obj);
		} catch (Exception e){
			throw e;
		}
	}
	
	public void deleteObj (Object obj) throws Exception{
		try{
			template.delete(obj);
		}
		catch (Exception e){
			throw e;
		}
	}
	
	
	public List<Author> getAllAuthors() throws Exception{
		List<Author> authorList = new ArrayList<Author>();
		try{
			authorList = template.loadAll(Author.class);
		}
		catch (Exception e){
			throw e;
		}
		
		return authorList;
	}

	public List<Publisher> getAllPublishers() throws Exception{
		List<Publisher> pubList = new ArrayList<Publisher>();
		try{
			pubList = template.loadAll(Publisher.class);
		}
		catch (Exception e){
			throw e;
		}
		
		return pubList;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
