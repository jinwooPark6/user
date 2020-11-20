package user;

public class UserController {
	private UserService userService;
	
	public UserController() {
		userService = new UserServiceImpl();
	}
	
	public void postJoin(UserDto user) {
		userService.join(user);
	}
	public UserDto postLogin(UserDto user) {
		return userService.login(user);
		
	}
	public void putUpdate(UserDto user) {
		userService.update(user);
	}
	public void deleteUser(UserDto user) {
		userService.delete(user);
	}
	public boolean getIdCheck(String id) {
		return userService.idCheck(id);
	}
	public UserDto getMypage(UserDto user) {
		return userService.mypage(user);
	}
	public int getCountSameName(String name) {
		return userService.countSameName(name);
	}
	public UserDto[] getUserList() {
		return userService.userList();
		
	}
	public UserDto getIdSearch(String id) {
		return userService.idSearch(id);
	}
	public UserDto[] getNameSearch(String name) {
		return userService.nameSearch(name);
	}
	public int getCount() {
		return userService.count();
	}
	
	
	
	

}
