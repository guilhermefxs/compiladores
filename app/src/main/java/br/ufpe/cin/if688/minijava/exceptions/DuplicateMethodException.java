package br.ufpe.cin.if688.minijava.exceptions;

public class DuplicateMethodException extends RuntimeException {
    public DuplicateMethodException(String methodName) {
        super("The method '" + methodName + "' was already declared!");
    }
}
