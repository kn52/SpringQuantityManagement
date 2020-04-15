package com.quantity.measurement;

import com.quantity.measurement.controller.QuantityMeasurementController;
import com.quantity.measurement.enums.UnitType;
import com.quantity.measurement.enums.Units;
import com.quantity.measurement.model.QuantityMeasurementDAO;
import com.quantity.measurement.service.IQuantityMeasurementService;
import com.quantity.measurement.service.QuantityMeasurementService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(QuantityMeasurementController.class)
public class QuantityMeasurementControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private IQuantityMeasurementService service;

    @Test
    public void getAllUnits_thenReturnList() throws Exception {
        Units[] expectedArray = {Units.LENGTH, Units.WEIGHT, Units.VOLUME, Units.TEMPERATURE};
        given(service.getUnits()).willReturn(Arrays.asList(expectedArray));
        mvc.perform(get("/quantity/all"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(Arrays.toString(expectedArray)));
    }


    @Test
    public void getSubUnits_thenReturnList() throws Exception {
        UnitType[] expectedArray = {UnitType.CELSIUS};
        given(service.getSubUnits(any())).willReturn(Arrays.asList(expectedArray));
        mvc.perform(get("/quantity?unit=LENGTH"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(Arrays.toString(expectedArray)));
    }

    @Test
    public void getConvertUnit_thenReturnOutput() throws Exception {
        double output=3.0;
        QuantityMeasurementDAO q=new QuantityMeasurementDAO(1,UnitType.FEET,Units.LENGTH,UnitType.INCH);
        given(service.convertUnit(any())).willReturn(output);
        mvc.perform(get("/quantity/convert"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(output)));
    }

    @Test
    void getAllUnits() {
        QuantityMeasurementService quantityMeasurementService= new QuantityMeasurementService();
        List<Enum> actualList=quantityMeasurementService.getUnits();
        Assert.assertEquals(4,actualList.size());
    }
}
