package br.ufpe.cin.if688.minijava.exceptions;

public class TooManyArgumentsException extends RuntimeException {
    public TooManyArgumentsException(String methodName) {
        super("Method '" + methodName + "' call has too many arguments");
    }
}
