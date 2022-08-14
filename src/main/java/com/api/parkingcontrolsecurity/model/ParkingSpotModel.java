package com.api.parkingcontrolsecurity.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10, name = "NUMERO_VAGA")
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true, length = 7, name = "PLACA_CARRO")
    private String licensePlateCar;

    @Column(nullable = false, length = 70, name = "MARCA_CARRO")
    private String brandCar;

    @Column(nullable = false, length = 70, name = "MODELO_CARRO")
    private String modelCar;

    @Column(nullable = false, length = 70, name = "COR")
    private String colorCar;

    @Column(nullable = false, name = "DATA_DE_REGISTRO")
    private LocalDateTime registrationDate;

    @Column(nullable = false, length = 130, name = "NOME_DO_RESPONSAVEL")
    private String responsibleName;

    @Column(nullable = false, length = 30, name = "APARTAMENTO")
    private String apartment;

    @Column(nullable = false, length = 30, name = "BLOCO")
    private String block;
}
