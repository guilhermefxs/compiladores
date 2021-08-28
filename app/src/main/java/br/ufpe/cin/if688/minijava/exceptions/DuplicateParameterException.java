package br.ufpe.cin.if688.minijava.exceptions;

public class DuplicateParameterException extends RuntimeException {
    public DuplicateParameterException(String parameterName) {
        super("The parameter '" + parameterName + "' was already declared!");
    }
}
