package action;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport implements SessionAware{
	private String userName;
	private String passWord;
	private Map session;
	
	
	

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		session.put("userName",this.userName);
		session.put("password",this.passWord);
		return "success";
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
		String upattern = "^[a-zA-Z_]+[a-zA-Z_0-9]+";
		
	
		if(!this.userName.matches(upattern)){
			this.addFieldError(userName, "用户名只能是数字、字母、下划线，而且只能字母或下划线开头！");
		}
		if(this.passWord.length()<6){
			this.addFieldError(passWord, "密码不能少于6位！");
		}
		
	}

	public void setSession(Map session) {
		// TODO Auto-generated method stub
	this.session=session;
	}
	

}
