package dao;

import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO {
	
	@Override
	public List<String> selectList() {
		//DB에서 값을 가져왔다고 가정
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("watermelon");
		list.add("koreanMelon");
		list.add("peach");
		
		return list;
	}
}
