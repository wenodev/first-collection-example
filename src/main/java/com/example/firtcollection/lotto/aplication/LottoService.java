package com.example.firtcollection.lotto.aplication;

import com.example.firtcollection.lotto.domain.Lotto;
import com.example.firtcollection.lotto.domain.LottoRequest;
import com.example.firtcollection.lotto.infra.LottoRepository;
import com.example.firtcollection.lotto.mapper.LottoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class LottoService {

    private final LottoRepository lottoRepository;

    public LottoService(LottoRepository lottoRepository) {
        this.lottoRepository = lottoRepository;
    }

    @Transactional
    public Lotto create(LottoRequest request) {
        validateDuplicate(request.getNumbers());
        Lotto lotto = LottoMapper.toEntity(request);
        return lottoRepository.save(lotto);
    }


    private void validateDuplicate(List<Integer> numbers) {
        Set<Integer> setNumbers = new HashSet<>(numbers);
        if (setNumbers.size() != numbers.size()){
            throw new IllegalArgumentException("중복된 숫자는 허용하지 않습니다.");
        }
    }

}
