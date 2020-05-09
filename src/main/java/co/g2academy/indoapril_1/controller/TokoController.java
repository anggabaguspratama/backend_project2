package co.g2academy.indoapril_1.controller;

import co.g2academy.indoapril_1.request.RequestToko;
import co.g2academy.indoapril_1.response.ResponseToko;
import co.g2academy.indoapril_1.service.ServiceToko;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api_1")
public class TokoController {
    @Autowired
    ServiceToko service;

    //Menampilkan Seluruh Data
    @GetMapping("/LihatSales/{Status}")
    public List<ResponseToko> getSales(@PathVariable String Status){return service.getToko(Status);
    }

    //Menambah Data Barang Masuk
    @PostMapping(value = "/TambahSales", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseToko postSales(@RequestBody RequestToko request){
        return service.create(request);
    }


}
