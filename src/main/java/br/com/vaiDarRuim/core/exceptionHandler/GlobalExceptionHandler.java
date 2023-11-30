package br.com.vaiDarRuim.core.exceptionHandler;


import java.util.Objects;

public class GlobalExceptionHandler {
//
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public ResponseEntity<ErrorResponse> handleException(Exception e) {
//        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno no servidor", Objects.requireNonNullElse(e.getMessage(), "Erro desconhecido"));
//        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @ExceptionHandler(IllegalArgumentException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<ErrorResponse> handleIllegalArgumentException(IllegalArgumentException e) {
//        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, "Requisição inválida", Objects.requireNonNullElse(e.getMessage(), "Argumento inválido"));
//        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
//    }
//
//    @ExceptionHandler(NullPointerException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<ErrorResponse> handleNullPointerException(NullPointerException e) {
//        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST, "Requisição inválida", "Valor nulo detectado");
//        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
//    }
}