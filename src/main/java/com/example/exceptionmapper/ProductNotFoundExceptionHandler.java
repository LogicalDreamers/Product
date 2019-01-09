package com.example.exceptionmapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.example.exception.ProductNotFound;

 
@Provider
public class ProductNotFoundExceptionHandler implements ExceptionMapper<ProductNotFound>
{
    @Override
    public Response toResponse(ProductNotFound exception)
    {
        return Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).build(); 
    }
}