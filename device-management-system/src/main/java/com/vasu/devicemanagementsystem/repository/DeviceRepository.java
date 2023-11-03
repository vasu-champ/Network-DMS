package com.vasu.devicemanagementsystem.repository;

import com.vasu.devicemanagementsystem.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device,Long> {
    Device findByName(String name);
    Device findByVersion(String version);
    Device findByBrand(String brand);
}
