package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor    //Generates a constructor taking all the final fields
@Getter     //Generates all the getters for fields
@ToString   //Includes a human-friendly toString() method in cour class
@EqualsAndHashCode  //Creates the equals and hashCode() methods
public final class Multiplication {

    //Both factors
    private final int factorA;
    private final int factorB;

    //Empty constructor for JSON (de) serialization
    Multiplication() {
        this(0,0);
    }

}
