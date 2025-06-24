package com.thealbert.springcommerce.service.user;

import com.thealbert.springcommerce.dto.UserDto;
import com.thealbert.springcommerce.model.User;
import com.thealbert.springcommerce.request.CreateUserRequest;
import com.thealbert.springcommerce.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
    UserDto convertUserToDto(User user);
    User getAuthenticatedUser();
}
