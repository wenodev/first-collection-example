package com.example.firtcollection.lotto.mapper;

import com.example.firtcollection.lotto.domain.LottoRequest;
import com.example.firtcollection.lotto.domain.Lotto;

public class LottoMapper {
    public static Lotto toEntity(LottoRequest request) {
        return new Lotto(request.getNumbers());
    }


}
