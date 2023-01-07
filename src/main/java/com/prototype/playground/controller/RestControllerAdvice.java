package com.prototype.playground.controllers;

import com.prototype.playground.PlaygroundConstants;
import com.prototype.playground.exceptions.GenericExceptionResponse;
import com.prototype.playground.exceptions.RequiredFieldInvalidException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class RestControllerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(RestControllerAdvice.class);

    @ResponseBody
    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public GenericExceptionResponse accessDeniedHandler(HttpServletRequest request, HttpServletResponse response,
                                                        AccessDeniedException exception)
    {
        return new GenericExceptionResponse.Builder().addRequestUrl(request.getRequestURI())
                .addStatus(HttpStatus.FORBIDDEN.value()).addHttpStatus(HttpStatus.FORBIDDEN.name())
                .addMessage(PlaygroundConstants.ACCESS_DENIED_MESSAGE).addDebugMessage(exception.getMessage()).build();
    }

    @ResponseBody
    @ExceptionHandler(RequiredFieldInvalidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public GenericExceptionResponse requiredFieldInvalidErrorHandler(HttpServletRequest request,
                                                                HttpServletResponse response, RequiredFieldInvalidException exception) {
        return new GenericExceptionResponse.Builder().addRequestUrl(request.getRequestURI())
                .addStatus(HttpStatus.BAD_REQUEST.value()).addHttpStatus(HttpStatus.BAD_REQUEST.name())
                .addMessage(PlaygroundConstants.BAD_REQUEST_MESSAGE).addDebugMessage(exception.getMessage()).build();
    }
}
