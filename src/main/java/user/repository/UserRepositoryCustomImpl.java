package user.repository;

import org.elasticsearch.action.index.IndexRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.UpdateQuery;
import org.springframework.data.elasticsearch.core.query.UpdateQueryBuilder;
import user.model.User;


public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public void updateUser(User userOld, User userNew) {
        IndexRequest indexRequest = new IndexRequest();
        indexRequest.source(
                "firstName", userNew.getFirstName(),
                "lastName", userNew.getLastName(),
                "email", userNew.getEmail()
                );

        UpdateQuery updateQuery = new UpdateQueryBuilder().withId(userOld.getId()).withClass(User.class)
                .withIndexRequest(indexRequest).build();

        elasticsearchTemplate.update(updateQuery);
    }
}
