package dev.dnnr.barbershop.barber;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BarberRepository extends JpaRepository<BarberModel, UUID>{
  List<BarberModel> findByEmail(String email);
  List<BarberModel> findByName(String name);
}
