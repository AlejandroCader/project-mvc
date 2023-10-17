package com.mvcproject.mvc.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*@Primary
@Component("miServicioSimple")*/
public class MiServicio implements IServicio{
    @Override
    public String operacion(){
        return "Ejecutando algun proceso importante simple...";
    }
}
