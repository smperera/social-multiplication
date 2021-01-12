package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity(name = "multiplication_result_attempt")
public final class MultiplicationResultAttempt {
    @Id
    @GeneratedValue
    @Column(name="result_attempt_id")
    private Long resultAttemptId;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private final User user;

    @ManyToOne(cascade = CascadeType.PERSIST) //Store data despite other entities are not available
    @JoinColumn(name = "multiplication_id")
    private final Multiplication multiplication;

    private final int resultAttempt;
    private final boolean correct;

    //Empty constructor for JSON (de)serialization
    MultiplicationResultAttempt() {
        user = null;
        multiplication = null;
        resultAttempt = -1;
        correct = false;
    }
}
