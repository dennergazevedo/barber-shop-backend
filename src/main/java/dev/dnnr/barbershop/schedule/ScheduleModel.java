package dev.dnnr.barbershop.schedule;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import dev.dnnr.barbershop.user.UserModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "schedules")
public class ScheduleModel {
  
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;
  private String status;
  private LocalDateTime startIn;
  private LocalDateTime endIn;

  @ManyToOne
  @JoinColumn(name="barber_id")
  private UserModel barberId;

  @ManyToOne
  @JoinColumn(name="user_id")
  private UserModel userId;

  private String serviceId;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
