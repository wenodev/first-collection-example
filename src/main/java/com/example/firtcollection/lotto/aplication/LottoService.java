package com.example.firtcollection.lotto.aplication;

import com.example.firtcollection.lotto.domain.Lotto;
import com.example.firtcollection.lotto.domain.LottoRequest;
import com.example.firtcollection.lotto.infra.LottoRepository;
import com.example.firtcollection.lotto.mapper.LottoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LottoService {

    private final LottoRepository lottoRepository;

    public LottoService(LottoRepository lottoRepository) {
        this.lottoRepository = lottoRepository;
    }

    @Transactional
    public Lotto create(LottoRequest request) {
        Lotto lotto = LottoMapper.toEntity(request);
        return lottoRepository.save(lotto);
    }

}
