package com.action.exam.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorTest {

    @Test
    @DisplayName("더하기 테스트")
    void plusTest() {
        Calculator calculator = new Calculator();
        assertThat(calculator.plus(1, 2)).isEqualTo(3);
    }
}