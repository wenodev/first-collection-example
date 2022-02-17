package com.example.firtcollection.lotto.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Lotto {
    @Id
    @GeneratedValue
    private Long id;

    private Integer lottoNumber;

    public Lotto() {
    }

    public Lotto(List<Integer> numbers) {
        this.lottoNumber = convertListToInteger(numbers);
    }

    private Integer convertListToInteger(List<Integer> numbers) {
        String match = "[^0-9]";
        String strNum = numbers.toString().replaceAll(match, "");
        Integer lottoNumber = Integer.valueOf(strNum);
        return lottoNumber;
    }
}
