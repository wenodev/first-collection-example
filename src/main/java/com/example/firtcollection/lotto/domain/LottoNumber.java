package com.example.firtcollection.lotto.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class LottoNumber {
    private List<Integer> numbers;

    public LottoNumber(List<Integer> numbers){
        validateDuplicate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private void validateDuplicate(List<Integer> numbers) {
        Set<Integer> setNumbers = new HashSet<>(numbers);
        if (setNumbers.size() != numbers.size()){
            throw new IllegalArgumentException("중복된 숫자는 허용하지 않습니다.");
        }
    }
}
