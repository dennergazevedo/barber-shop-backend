package dev.dnnr.barbershop.barber;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;


@RestController
@RequestMapping("/barber")
public class BarberController {

  @Autowired
  private BarberRepository barberRepository;

    @PostMapping("/")
  public ResponseEntity create(@RequestBody BarberModel barber){
    var existBarber = this.barberRepository.findByEmail(barber.getEmail());

    if(existBarber.size() != 0) {
      /* APENAS PARA TESTE, REGRA NÃO FAZ SENTIDO FALANDO DE LGPD */
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Barbeiro já existe");
    }

    /* HASH PASSWORD */
    var hash = BCrypt.withDefaults().hashToString(12, barber.getPassword().toCharArray());
    barber.setPassword(hash);

    /* SALVANDO NA DATABASE */
    var barberCreated = this.barberRepository.save(barber);

    /* RETORNO COM STATUS HTTP PERSONALIZADO */
    return ResponseEntity.status(HttpStatus.CREATED).body(barberCreated);
  }

  @GetMapping("/")
  public ResponseEntity<List<BarberModel>> getAllUsers(){
      List<BarberModel> barbers = this.barberRepository.findAll();
      return new ResponseEntity<>(barbers, HttpStatus.OK);
  }
}
