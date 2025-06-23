package com.Veicoli.Service;

import com.Veicoli.Model.Veicoli;
import com.Veicoli.Repository.VeicoliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VeicoliService {

    @Autowired
    private VeicoliRepository veicoliR;

    public List<Veicoli> getVeicoli(){
        return veicoliR.findAll();
    }

    public void insert(Veicoli v) {
        veicoliR.save(v);
    }

    public void update(Veicoli v) {
        veicoliR.save(v);
    }

    public void delete(Veicoli v) {
        veicoliR.deleteById(v.getId());
    }

}