package dev.dnnr.barbershop.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {

  @Autowired
  private ServiceRepository serviceRepository;

  @PostMapping("/")
  public ResponseEntity create(@RequestBody ServiceModel service){
    /* SALVANDO NA DATABASE */
    var serviceCreated = this.serviceRepository.save(service);

    /* RETORNO COM STATUS HTTP PERSONALIZADO */
    return ResponseEntity.status(HttpStatus.CREATED).body(serviceCreated);
  }

  @GetMapping("/")
  public ResponseEntity<List<ServiceModel>> getAllServices(){
      List<ServiceModel> services = this.serviceRepository.findAll();
      return new ResponseEntity<>(services, HttpStatus.OK);
  }
}
