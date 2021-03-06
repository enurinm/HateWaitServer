package hatewait.vo;

public class ClientVo {
	String id;
	int phone;
	String name;
	int peopleNum;
	boolean isMember;
	@Override
	public String toString() {
		return "ClientVo [id=" + id + ", phone=" + phone + ", name=" + name + ", peopleNum=" + peopleNum + ", isMember="
				+ isMember + "]";
	}
	public String column() {
		return "id, phone, name, peopleNum, isMember";
	}
	public String value() {
		return "'"+id+"', "+phone+", '"+name+"', "+peopleNum+", "+isMember;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	public boolean isMember() {
		return isMember;
	}
	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}
}
