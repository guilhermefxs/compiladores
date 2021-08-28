package br.ufpe.cin.if688.minijava.exceptions;

public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException(String id) {
        super("Identifier '" + id + "' could not be found");
    }
}
