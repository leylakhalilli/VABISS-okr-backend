package com.vabiss.okrbackend.service.inter;

import com.vabiss.okrbackend.dto.UserDto;
import com.vabiss.okrbackend.entity.User;

public interface UserService {

    String updatePassword(String verificationToken, String newPassword);

    User updateDisplayName(int userId, String newDisplayName);

    User updateAvatar(int userId, String newAvatar);

    UserDto convertToUserDto(User user);

//    User getAllTeamMember(String organizationName);

    void deleteTeamMemberAndViewer(int userId,String organizationName);

}
