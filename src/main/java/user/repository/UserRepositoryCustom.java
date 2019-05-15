package user.repository;

import user.model.User;

public interface UserRepositoryCustom {


    void updateUser(User userOld, User userNew);
}
