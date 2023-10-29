package dev.dnnr.barbershop.schedule;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.dnnr.barbershop.user.UserModel;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<ScheduleModel, UUID>{
  List<ScheduleModel> findByUserId(UserModel userId);
  List<ScheduleModel> findByBarberId(UserModel barberId);
  List<ScheduleModel> findByServiceId(String serviceId);
}
