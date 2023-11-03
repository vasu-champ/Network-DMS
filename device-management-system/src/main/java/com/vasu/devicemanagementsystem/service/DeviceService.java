package com.vasu.devicemanagementsystem.service;


import com.vasu.devicemanagementsystem.entity.Device;
import com.vasu.devicemanagementsystem.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {


    @Autowired
    private DeviceRepository repository;

    public Device saveDevice(Device device) {
        return repository.save(device);
    }

    public List<Device> saveProducts(List<Device> devices) {
        return repository.saveAll(devices);
    }

    public List<Device> getDevices() {
        return repository.findAll();
    }

    public Device getDeviceById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Device getDeviceByName(String name) {
        return repository.findByName(name);
    }
    public Device getDeviceByVersion(String version) {
        return repository.findByVersion(version);
    }
    public Device getDeviceByBrand(String brand) {
        return repository.findByBrand(brand);
    }
    public String deleteProduct(Long id) {
        repository.deleteById(id);
        return "device removed successfully !! " + id;
    }
    public Device updateDevice(Device device) {
        Device existingDevice = repository.findById(device.getId()).orElse(null);
        existingDevice.setName(device.getName());
        existingDevice.setVersion(device.getVersion());
        existingDevice.setBrand(device.getBrand());
        return repository.save(existingDevice);
    }

}
