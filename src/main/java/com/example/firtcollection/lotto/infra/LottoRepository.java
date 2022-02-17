package com.example.firtcollection.lotto.infra;

import com.example.firtcollection.lotto.domain.Lotto;
import org.springframework.data.repository.CrudRepository;

public interface LottoRepository extends CrudRepository<Lotto, Long> {
}
