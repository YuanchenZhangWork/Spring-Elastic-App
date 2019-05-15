package user.repository;


import org.springframework.stereotype.Repository;
import user.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


@Repository
public interface UserRepository extends ElasticsearchRepository<User, String>, UserRepositoryCustom {
    List<User> findByEmail(String email);
}
