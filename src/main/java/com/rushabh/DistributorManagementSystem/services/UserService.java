package com.rushabh.DistributorManagementSystem.services;

import com.rushabh.DistributorManagementSystem.dtos.LoginRequest;
import com.rushabh.DistributorManagementSystem.dtos.RegisterRequest;
import com.rushabh.DistributorManagementSystem.dtos.Response;
import com.rushabh.DistributorManagementSystem.dtos.UserDTO;
import com.rushabh.DistributorManagementSystem.models.User;

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
