package dev.dnnr.barbershop.user;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, UUID>{
  List<UserModel> findByEmail(String email);
}
