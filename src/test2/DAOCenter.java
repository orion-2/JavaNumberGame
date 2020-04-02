package test2;

public class DAOCenter { //memberDAO, BasketDAO 접근하기 위한 클래스.
	DAOInterface DAO = null;
	Object m = 
	
	public int setDAO(String type) {
		
		switch (type) {
		case "1" :
			DAO = new MemberDAO();
			break;
		case "2" :
			DAO = new BasketDAO(); 
			break;
		}
		return DAO.insert(m);
	}
}
