package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // 방 ID

    private String roomName;
    private String roomImageUri;
    private String address;
    private double area;  // 전용 면적 (평수 또는 m²)
    private double rentalPrice;  // 임대료
    private String location;  // 위치
    private String description;
    private String RoomUse;
    private int roomNumber; // 방수
    private int toilet; // 화장실 수
    private int living; // 거실 수
    private int kitchen; // 부엌 수

    // 추가된 created 필드
    private LocalDateTime created;  // 방 생성 시간을 저장


    // Getter, Setter, 기타 필요한 코드들
    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomImageUri() {
        return roomImageUri;
    }

    public void setRoomImageUri(String roomImageUri) {
        this.roomImageUri = roomImageUri;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRoomUse() {
        return RoomUse;
    }

    public void setRoomUse(String roomUse) {
        RoomUse = roomUse;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getToilet() {
        return toilet;
    }

    public void setToilet(int toilet) {
        this.toilet = toilet;
    }

    public int getLiving() {
        return living;
    }

    public void setLiving(int living) {
        this.living = living;
    }

    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int kitchen) {
        this.kitchen = kitchen;
    }
}
