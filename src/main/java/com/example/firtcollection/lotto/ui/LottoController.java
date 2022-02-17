package com.example.firtcollection.lotto.ui;

import com.example.firtcollection.lotto.domain.LottoRequest;
import com.example.firtcollection.lotto.aplication.LottoService;
import com.example.firtcollection.lotto.domain.Lotto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LottoController {
    private final LottoService lottoService;

    public LottoController(LottoService lottoService) {
        this.lottoService = lottoService;
    }

    @PostMapping("/lotto")
    public Lotto create(@RequestBody LottoRequest request){
        return lottoService.create(request);
    }
}
