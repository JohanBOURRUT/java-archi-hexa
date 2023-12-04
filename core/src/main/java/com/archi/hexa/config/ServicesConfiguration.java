package com.archi.hexa.config;

import com.archi.hexa.service.in.ICarServiceIn;
import com.archi.hexa.service.in.IGarageServiceIn;
import com.archi.hexa.service.in.impl.CarServiceIn;
import com.archi.hexa.service.in.impl.GarageServiceIn;
import com.archi.hexa.service.out.ICarServiceOut;
import com.archi.hexa.service.out.IGarageServiceOut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfiguration {

    @Bean
    public ICarServiceIn carServiceIn(ICarServiceOut carServiceOut){
        return new CarServiceIn(carServiceOut);
    }

    @Bean
    public IGarageServiceIn garageServiceIn(IGarageServiceOut garageServiceOut){
        return new GarageServiceIn(garageServiceOut);
    }

}
