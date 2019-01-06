package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void join(String id,String pass,String name,String ssn);
	public ArrayList<MemberBean> findAll();
	public ArrayList<MemberBean> findByName(String name);
	public MemberBean findById(String id);
	public int count();
	public boolean exsitLogin();
	public void updatePass(String id, String pass, String newpass);
	public void deleteId(String id, String pass, String ssn);
	
}
