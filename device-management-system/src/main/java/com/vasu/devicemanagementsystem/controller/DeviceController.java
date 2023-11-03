package com.vasu.devicemanagementsystem.controller;

import com.vasu.devicemanagementsystem.entity.Device;
import com.vasu.devicemanagementsystem.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {
    @Autowired
    private DeviceService service;

    @PostMapping("/addDevice")
    public Device addDevice(@RequestBody Device device) {
        return service.saveDevice(device);
    }



    @GetMapping("/devices")
    public List<Device> findAllDevices() {
        return service.getDevices();
    }

    @GetMapping("/deviceById/{id}")
    public Device findDeviceById(@PathVariable Long id) {
        return service.getDeviceById(id);
    }

    @GetMapping("/device/{name}")
    public Device findDeviceByName(@PathVariable String name) {
        return service.getDeviceByName(name);
    }
    @GetMapping("/device/{version}")
    public Device findDeviceByVersion(@PathVariable String version) {
        return service.getDeviceByVersion(version);
    }
    @GetMapping("/device/{brand}")
    public Device findDeviceByBrand(@PathVariable String brand) {
        return service.getDeviceByBrand(brand);
    }
    @PutMapping("/update")
    public Device updateDevice(@RequestBody Device device) {
        return service.updateDevice(device);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDevice(@PathVariable Long id) {
        return service.deleteProduct(id);
    }
}
