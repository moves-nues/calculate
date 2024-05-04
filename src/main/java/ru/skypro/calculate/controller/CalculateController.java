package ru.skypro.calculate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.calculate.service.CalculateService;

@RestController
@RequestMapping("calculate")
public class CalculateController {

    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String calculate() {
        return "<b>Добро пожаловать в калькулятор!!!</b>";
    }
    @GetMapping("minus")
    public String minus(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает аргумента"; }
        return num1 + "-" + num2 + "=" + calculateService.minus(num1, num2);

    }
    @GetMapping("plus")
    public String plus(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает аргумента"; }

        return num1 + " + " + num2 + "=" + calculateService.plus(num1, num2);


    } @GetMapping("divide")
    public String divide(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает аргумента"; }

        if (num2 == 0) {
            return "На ноль делить нельзя";
        }
        return num1 + " / " + num2 + "=" + calculateService.divide(num1, num2);

    } @GetMapping("multiply")
    public String multiply(@RequestParam(required = false, name = "num1") Integer num1, @RequestParam(required = false, name = "num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return "Не хватает аргумента"; }
        return num1 + " * " + num2 + "=" + calculateService.multiply(num1, num2);

    }
}
