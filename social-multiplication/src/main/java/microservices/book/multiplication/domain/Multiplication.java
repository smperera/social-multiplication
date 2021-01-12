package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@RequiredArgsConstructor    //Generates a constructor taking all the final fields
@Getter     //Generates all the getters for fields
@ToString   //Includes a human-friendly toString() method in cour class
@EqualsAndHashCode  //Creates the equals and hashCode() methods
@Entity(name="multiplication")
public final class Multiplication {
    @Id
    @GeneratedValue
    @Column(name="multiplication_id")
    private Long multiplicationId;
    //Both factors

    private final int factorA;
    private final int factorB;

    //Empty constructor for JSON (de) serialization
    Multiplication() {
        this(0,0);
    }

}
