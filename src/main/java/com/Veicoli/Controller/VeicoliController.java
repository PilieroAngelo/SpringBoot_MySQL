package com.Veicoli.Controller;

import com.Veicoli.Model.Veicoli;
import com.Veicoli.Service.VeicoliService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veicoli")
public class VeicoliController {

    private final VeicoliService veicoliService;


    public VeicoliController(VeicoliService veicoliService) {
        this.veicoliService = veicoliService;
    }

    @GetMapping
    public ResponseEntity<List<Veicoli>> getVeicoli() {
        List<Veicoli> veicoliList = veicoliService.getVeicoli();
        if (veicoliList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(veicoliList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody Veicoli veicolo) {
        veicoliService.insert(veicolo);
        return new ResponseEntity<>("Inserimento Effettuato", HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Veicoli veicolo) {
        veicoliService.update(veicolo);
        return new ResponseEntity<>("Update Effettuato", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody Veicoli veicolo) {
        veicoliService.delete(veicolo);
        return new ResponseEntity<>("Eliminazione Effettuata", HttpStatus.OK);
    }
}
