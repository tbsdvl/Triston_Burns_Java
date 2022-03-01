package com.company.MathAndMonthService.controller;

import com.company.MathAndMonthService.models.MathSolution;
import com.company.MathAndMonthService.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MathAndMonthServiceController {

    //        List of months
    private static List<String> monthList = new ArrayList<>(Arrays.asList(
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    ));

    //    Month converter endpoint
    @GetMapping("/month/{monthNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonth(@PathVariable int monthNumber) {

        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException("Month number must be between 1 and 12.");
        } else {
            return new Month(monthNumber, monthList.get(monthNumber - 1));
        }
    }

    @GetMapping("/randomMonth")
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth() {

//        Random month
        double randomNumber = Math.abs(Math.ceil(Math.random() * monthList.size()));

//        Index into monthList with randomNumber (double casts to int)
        return new Month((int) randomNumber, monthList.get((int) (randomNumber - 1)));
    }

    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution getAdditionSolution(@RequestBody @Valid MathSolution addition) {

//        Check if both operand values are equal to zero.
//        If both values are equal to zero, this indicates the POST method
//        Instantiates a new MathSolution object from the request's body
//        Without any integers provided by the client that sent the request
        if (addition.getOperand1() == 0 || addition.getOperand2() == 0) {
            throw new IllegalArgumentException("Request Body must include operand1 and operand2 numbers greater than zero.");
        } else {

            try {
                int num1 = addition.getOperand1();
                int num2 = addition.getOperand2();

                MathSolution solution = new MathSolution();
                solution.setOperand1(num1);
                solution.setOperand2(num2);
                solution.setOperation("add");
                solution.setAnswer(num1 + num2);

                return solution;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    @PostMapping("/subtract")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution getSubtractSolution(@RequestBody @Valid MathSolution subtract) {

//        Check if both operand values are equal to zero.
//        If both values are equal to zero, this indicates the POST method
//        Instantiates a new MathSolution object from the request's body
//        Without any integers provided by the client that sent the request
        if (subtract.getOperand1() == 0 || subtract.getOperand2() == 0) {
            throw new IllegalArgumentException("Request Body must include operand1 and operand2 numbers greater than zero.");
        } else {

            try {
                int num1 = subtract.getOperand1();
                int num2 = subtract.getOperand2();

                MathSolution solution = new MathSolution();
                solution.setOperand1(num1);
                solution.setOperand2(num2);
                solution.setOperation("subtract");
                solution.setAnswer(num1 - num2);

                return solution;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    @PostMapping("/multiply")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution getMultiplicationSolution(@RequestBody @Valid MathSolution multiply) {

//        Check if both operand values are equal to zero.
//        If both values are equal to zero, this indicates the POST method
//        Instantiates a new MathSolution object from the request's body
//        Without any integers provided by the client that sent the request
        if (multiply.getOperand1() == 0 || multiply.getOperand2() == 0) {
            throw new IllegalArgumentException("Request Body must include operand1 and operand2 numbers greater than zero.");
        } else {

            try {
                int num1 = multiply.getOperand1();
                int num2 = multiply.getOperand2();

                MathSolution solution = new MathSolution();
                solution.setOperand1(num1);
                solution.setOperand2(num2);
                solution.setOperation("multiply");
                solution.setAnswer(num1 * num2);

                return solution;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    @PostMapping("/divide")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution getDivisionSolution(@RequestBody @Valid MathSolution divide) {

//        Check if both operand values are equal to zero.
//        If both values are equal to zero, this indicates the POST method
//        Instantiates a new MathSolution object from the request's body
//        Without any integers provided by the client that sent the request
        if (divide.getOperand1() == 0 || divide.getOperand2() == 0) {
            throw new IllegalArgumentException("Request Body must include operand1 and operand2 numbers greater than zero.");
        } else {

            try {
                int num1 = divide.getOperand1();
                int num2 = divide.getOperand2();

                MathSolution solution = new MathSolution();
                solution.setOperand1(num1);
                solution.setOperand2(num2);
                solution.setOperation("divide");
                solution.setAnswer(num1 / num2);

                return solution;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }
}
