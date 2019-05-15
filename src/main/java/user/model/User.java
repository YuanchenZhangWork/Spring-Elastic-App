package user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document(indexName = "ifind", type="users")
public class User {
    @Id
    private String id;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Size(min=2, max=30)
    private String firstName;

    @Size(min=2, max=30)
    private String lastName;

    public User() {

    }

    public User(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return this.id;
    }

    public String getFirstName() {

        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' + ',' +
                "name='" + firstName + " " + lastName + '\'' + ',' +
                "email='" + email + '\'' +
                '}';
    }
}
