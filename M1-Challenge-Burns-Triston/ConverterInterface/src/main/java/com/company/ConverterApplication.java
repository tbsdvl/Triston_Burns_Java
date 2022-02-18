package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ConverterApplication {

    public static void main(String[] args) {

//        Instantiate ConverterIf & ConverterSwitch
        ConverterIf convertIf = new ConverterIf();
        ConverterSwitch convertSwitch = new ConverterSwitch();

//        ConverterIf Instances
        String janIf = convertIf.convertMonth(1);
        String mayIf = convertIf.convertMonth(5);
        String monIf = convertIf.convertDay(2);
        String friIf = convertIf.convertDay(6);
        String satIf = convertIf.convertDay(7);

//        Output ConverterIf instance values to console
        System.out.println("ConverterIf instance values");
        System.out.println("------------------------------------\n");
        System.out.println(janIf);
        System.out.println(mayIf);
        System.out.println(monIf);
        System.out.println(friIf);
        System.out.println(satIf);

//        ConverterSwitch Instances
        System.out.println("\nConverterSwitch instance values");
        System.out.println("------------------------------------\n");
        String janSwitch = convertSwitch.convertMonth(1);
        String maySwitch = convertSwitch.convertMonth(5);
        String monSwitch = convertSwitch.convertDay(2);
        String friSwitch = convertSwitch.convertDay(6);
        String satSwitch = convertSwitch.convertDay(7);

//        Output ConverterSwitch instance values to console
        System.out.println(janSwitch);
        System.out.println(maySwitch);
        System.out.println(monSwitch);
        System.out.println(friSwitch);
        System.out.println(satSwitch);
    }

}
