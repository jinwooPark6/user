package user;

public interface UserDao {
	public void insertJoin(UserDto user);
	public UserDto login(UserDto user);
	public void updateUser(UserDto user);
	public void deleteUser(UserDto user);
	public boolean selectIdCheck(String id);
	public UserDto selectUser(UserDto user);	
	public UserDto[] selectUserList();
	public UserDto selectById(String id);
	public UserDto[] selectByName(String name);
	public int selectCount();
}
