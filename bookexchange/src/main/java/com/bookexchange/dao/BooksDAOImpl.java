package com.bookexchange.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bookexchange.entity.BookEntity;
import com.bookexchange.model.Book;


@Repository
@Component
public class BooksDAOImpl implements BooksDAO{

	@Autowired
	 @Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Book> getAllBooks() throws Exception {
		 Session session = sessionFactory.openSession();
	        Query query = (Query) session.createQuery("from Book");
	        List<BookEntity> rst = query.getResultList();
	        session.close();
	        List<Book> bookList = new ArrayList<Book>();
	        for(BookEntity be : rst) {
	        	Book book = new Book();
	        	book.setAuthor(be.getAuthor());
	        	book.setBookId(be.getBookId());
	        	book.setBookName(be.getBookName());
	        	book.setISBN(be.getISBN());
	        	book.setPrice(be.getPrice());
	        }
	        
	        return bookList;
	}

	@Override
	public Book addBook(Book book) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateBook(Book book) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book deleteBook(Book book) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
