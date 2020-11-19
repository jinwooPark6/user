package user;

public class UserController {
	private UserService userService;
	
	public UserController(){
		userService = new UserServiceImpl();
	}
	public void postJoin(UserDto user) {
		userService.join(user); 
		
	}
	public UserDto postLogIn(UserDto user) {
		return userService.logIn(user);
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
	public UserDto[] getList() {
		return userService.list();
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
