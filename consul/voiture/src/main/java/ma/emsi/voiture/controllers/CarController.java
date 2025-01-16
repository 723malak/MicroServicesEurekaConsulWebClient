package ma.emsi.voiture.controllers;

import ma.emsi.voiture.models.CarResponse;
import ma.emsi.voiture.services.CarWebClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/voiture")
public class CarController {


    @Autowired
    private CarWebClientService carWebClientService;

    @GetMapping("/webclient/all")
    public List<CarResponse> findAllWebClient() {
        return carWebClientService.findAll ();
    }

    @GetMapping("/webclient/{id}")
    public CarResponse findByIdWebClient(@PathVariable Long id) throws Exception{
        return carWebClientService.findById (id);
    }
}