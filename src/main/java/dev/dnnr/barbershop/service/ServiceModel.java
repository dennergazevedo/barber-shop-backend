package dev.dnnr.barbershop.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "services")
public class ServiceModel {
  
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;
  private String name;
  private Float price;
  private Integer estimatedIn;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
