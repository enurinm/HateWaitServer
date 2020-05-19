package HateWait.Util;

import java.sql.ResultSet;
import java.sql.SQLException;

import HateWait.Vo.ClientVo;
import HateWait.Vo.MemberVo;
import HateWait.Vo.QueueVo;
import HateWait.Vo.StoreVo;

public class SettingUtil {
	
	public ClientVo setClientVo(String id, int phone, String name, int peopleNum, boolean isMember) {
		ClientVo cvo = new ClientVo();
		cvo.setId(id);
		cvo.setMember(isMember);
		cvo.setName(name);
		cvo.setPeopleNum(peopleNum);
		cvo.setPhone(phone);
		return cvo;
	}
	
	public ClientVo setClientVo(ResultSet rs) {
		ClientVo cvo = new ClientVo();
		try {
			rs.next();
			cvo.setId(rs.getString("id"));
			cvo.setMember(rs.getBoolean("isMember"));
			cvo.setName(rs.getString("name"));
			cvo.setPeopleNum(rs.getInt("peopleNum"));
			cvo.setPhone(rs.getInt("phone"));
		}catch (SQLException e){
			System.out.println("HateWait.Util.SettingUtil::ResultSet setting error:: "+e);
		}
		return cvo;
	}
	
	public MemberVo setMemberVo(String id, String name, int phone) {
		MemberVo mvo = new MemberVo();
		mvo.setId(id);
		mvo.setName(name);
		mvo.setPhone(phone);
		return mvo;
	}
	
	public QueueVo setQueueVo(String sid,String cid,int turn) {
		QueueVo qvo=new QueueVo();
		//sid, cid�� �����ϴ��� Ȯ���ϰ� ������ ���� ����ϴ� �ڵ� �߰�
		qvo.setCid(cid);
		qvo.setSid(sid);
		qvo.setTurn(turn);
		return qvo;
	}
	
	public StoreVo setStoreVo(String id, String name, String info, String time, int anum) {
		StoreVo svo=new StoreVo();
		svo.setId(id);
		svo.setName(name);
		svo.setInfo(info);
		svo.setTime(time);
		svo.setAnum(anum);
		return svo;
	}

}