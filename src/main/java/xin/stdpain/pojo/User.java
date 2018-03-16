package xin.stdpain.pojo;

//import java.sql.Date;
import java.util.Date;

public class User {
	private Integer id;
	private String username;
	private String password;
	private Date createdTime;
	private String type;

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User{" + id + "," + username + "," + password + "," + createdTime + "," + type + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User user = (User) obj;
		if (this.username.equals(user.username) && this.password.equals(user.password)) {
			return true;
		} else
			return false;
	}
}