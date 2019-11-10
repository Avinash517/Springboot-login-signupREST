package com.cloudsolv;

public interface UserService {

	ApiResponse signUp(SignUpDto signUpDto);
	ApiResponse login(LoginDto loginDto);

}
