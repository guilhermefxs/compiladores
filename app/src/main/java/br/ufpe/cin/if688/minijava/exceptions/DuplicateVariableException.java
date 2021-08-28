package br.ufpe.cin.if688.minijava.exceptions;

public class DuplicateVariableException extends RuntimeException {
    public DuplicateVariableException(String variableName) {
        super("The variable '" + variableName + "' was already declared!");
    }
}
