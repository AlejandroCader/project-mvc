package com.mvcproject.mvc.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*@Primary
@Component("miServicioComplejo")*/
public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion(){
        return "Ejecutando algun proceso importante complicado...";
    }
}
