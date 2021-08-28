package br.ufpe.cin.if688.minijava.exceptions;

public class TooFewArgumentsException extends RuntimeException {
    public TooFewArgumentsException(String methodName) {
        super("Method '" + methodName + "' call has too few arguments");
    }
}
