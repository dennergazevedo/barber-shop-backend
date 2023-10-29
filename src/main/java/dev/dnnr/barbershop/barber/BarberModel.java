package dev.dnnr.barbershop.barber;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="barbers")
public class BarberModel {
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;
  private String name;
  private String phone;
  
  @Column(unique = true)
  private String email;
  private String password;

  private LocalDateTime startIn;
  private LocalDateTime endIn;
  private String offIn;
 
  @CreationTimestamp
  private LocalDateTime createdAt;
}
