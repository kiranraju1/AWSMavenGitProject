package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.Dao.BookInfoDao;
import com.project.dto.BookInfoDto;

@Service("bookInfoService")
public class BookInfoServiceImpl implements BookInfoService{
	
	@Autowired
	BookInfoDao bookInfoDao;

	
	@Override
	@Transactional
	public BookInfoDto getBookById(int bookId) {
	
		return bookInfoDao.getBookById(bookId);
	}


	@Override
	@Transactional
	public List<BookInfoDto> getAllBooks() {
		
		return bookInfoDao.getAllBooks();
	}


	@Override
	@Transactional
	public BookInfoDto saveBook(BookInfoDto bookInfoDto) {
		// TODO Auto-generated method stub
		return bookInfoDao.saveBook(bookInfoDto);
	}
	
	

}
