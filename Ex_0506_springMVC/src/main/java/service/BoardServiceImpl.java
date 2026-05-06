package service;

import java.util.List;

import dao.BoardDAO;
import dao.BoardDAOImpl;

public class BoardServiceImpl implements BoardService{
	BoardDAO dao = null;
	
	public BoardServiceImpl(BoardDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<?> selectList() {
		return dao.selectList();
	}
	
}
