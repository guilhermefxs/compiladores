package br.ufpe.cin.if688.minijava.exceptions;

public class UndefinedVariableException extends RuntimeException {
    public UndefinedVariableException(String variableName) {
        super("Variable '" + variableName + "' not defined in current scope");
    }
}
