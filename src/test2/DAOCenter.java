package test2;

public class DAOCenter { //memberDAO, BasketDAO �����ϱ� ���� Ŭ����.
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
