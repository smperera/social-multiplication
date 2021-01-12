package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

import java.util.List;

public interface MultiplicationService {
    Multiplication createRandomMultiplication();
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
    public List<MultiplicationResultAttempt> getStatsForUser(String userAlias);
}
