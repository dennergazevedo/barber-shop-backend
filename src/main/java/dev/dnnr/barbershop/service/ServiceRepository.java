package dev.dnnr.barbershop.service;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ServiceRepository extends JpaRepository<ServiceModel, UUID>{
  List<ServiceModel> findByName(String name);
  List<ServiceModel> findByPrice(Float price);
}
