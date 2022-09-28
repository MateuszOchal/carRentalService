package com.pl.carrentalservice.rent;


import com.pl.carrentalservice.employees.Employee;
import com.pl.carrentalservice.reservation.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private LocalDate dateOfReturn;
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
    private Integer additionalCharges;
    private String remarks;

}