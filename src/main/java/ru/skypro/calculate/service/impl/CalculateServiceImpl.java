package ru.skypro.calculate.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.calculate.service.CalculateService;

@Service
public class CalculateServiceImpl implements CalculateService {


    @Override
    public int plus(int num1, int num2) {
        return 0;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        return num1 / num2;
    }
}
