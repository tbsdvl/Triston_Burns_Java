package com.company.MathAndMonthService.controller;

import com.company.MathAndMonthService.models.MathSolution;
import com.company.MathAndMonthService.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MathAndMonthServiceController.class)
public class RestWebServiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    //    Convert java objects to and from JSON
    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {


    }

    @Test
    public void shouldReturnCorrespondingMonthStringAndIntegerWith200Status() throws Exception {

        int monthNumber = 1;

//      Output month json
        Month january = new Month(1, "January");
        String outputJson = mapper.writeValueAsString(january);

        mockMvc.perform(
                        get("/month/1")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));

    }

    @Test
    public void shouldReturn422StatusWithOutOfRangeMonthNumber() throws Exception {

        mockMvc.perform(
                        get("/month/13")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturnARandomMonthStringWithValidMonthNumber() throws Exception {

        mockMvc.perform(
                        get("/randomMonth")
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldCreateANewAddMathSolutionAndReturnSumOfTwoNumbers() throws Exception {

//        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(1);
        inputSolution.setOperand2(2);

//        Output math solution
        MathSolution outputSolution = new MathSolution();
        outputSolution.setOperand1(1);
        outputSolution.setOperand2(2);
        outputSolution.setOperation("add");
        outputSolution.setAnswer(3);


//        Json Strings
        String inputJson = mapper.writeValueAsString(inputSolution);
        String outputJson = mapper.writeValueAsString(outputSolution);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewAdditionMathSolution() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewAdditionMathSolutionWithOperand1Only() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(1);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewAdditionMathSolutionWithOperand2Only() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand2(1);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldCreateANewSubtractMathSolutionAndReturnDifferenceOfTwoNumbers() throws Exception {

//        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(1);
        inputSolution.setOperand2(2);

//        Output math solution
        MathSolution outputSolution = new MathSolution();
        outputSolution.setOperand1(1);
        outputSolution.setOperand2(2);
        outputSolution.setOperation("subtract");
        outputSolution.setAnswer(-1);


//        Json Strings
        String inputJson = mapper.writeValueAsString(inputSolution);
        String outputJson = mapper.writeValueAsString(outputSolution);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewSubtractMathSolution() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewSubtractMathSolutionWithOperand1Only() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(1);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewSubtractMathSolutionWithOperand2Only() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand2(1);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldCreateANewMultiplicationMathSolutionAndReturnProductOfTwoNumbers() throws Exception {

//        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(2);
        inputSolution.setOperand2(2);

//        Output math solution
        MathSolution outputSolution = new MathSolution();
        outputSolution.setOperand1(2);
        outputSolution.setOperand2(2);
        outputSolution.setOperation("multiply");
        outputSolution.setAnswer(4);


//        Json Strings
        String inputJson = mapper.writeValueAsString(inputSolution);
        String outputJson = mapper.writeValueAsString(outputSolution);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewMultiplicationMathSolution() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewMultiplicationMathSolutionWithOperand1Only() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(1);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewMultiplicationMathSolutionWithOperand2Only() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand2(1);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldCreateANewDivisionMathSolutionAndReturnQuotientOfTwoNumbers() throws Exception {

//        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(2);
        inputSolution.setOperand2(2);

//        Output math solution
        MathSolution outputSolution = new MathSolution();
        outputSolution.setOperand1(2);
        outputSolution.setOperand2(2);
        outputSolution.setOperation("divide");
        outputSolution.setAnswer(1);


//        Json Strings
        String inputJson = mapper.writeValueAsString(inputSolution);
        String outputJson = mapper.writeValueAsString(outputSolution);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewDivisionMathSolution() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewDivisionMathSolutionWithOperand1Only() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand1(1);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewDivisionMathSolutionWithOperand2Only() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand2(1);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewDivisionMathSolutionWithZeroDivisionDenominator() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand2(1);
        inputSolution.setOperand2(0);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldReturn422StatusWhenCreatingNewDivisionMathSolutionWithZeroDivisionNumerator() throws Exception {

        //        Input math solution
        MathSolution inputSolution = new MathSolution();
        inputSolution.setOperand2(0);
        inputSolution.setOperand2(1);

//        Input json string
        String inputJson = mapper.writeValueAsString(inputSolution);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

}
