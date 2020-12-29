package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity(name="user")
public final class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long userId;

    private final String alias;

    //Empty constructor for JSON (de)serialization
    protected User() {
        alias = null;
    }
}
