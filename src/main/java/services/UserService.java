package services;

import dtos.LoginRequest;
import dtos.RegisterRequest;
import dtos.Response;
import dtos.UserDTO;
import models.User;

public interface UserService {

	Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
