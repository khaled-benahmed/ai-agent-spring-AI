package com.example.myaiagentsapp.tools;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service("financialDataTool")
@Description("""
        Get financial data about the company including : 
        - The turnover of the last 3 years 
        - The profit of the last 3 years
        - The value of stock in the last 7 days
        """)
public class FinancialDataTool implements Function<FinancialDataTool.Request,FinancialDataTool.Response> {
    @Override
    public Response apply(Request request) {
        return new Response(
                new double []{1000000,2000000,3000000},
                new double []{10000,20000,3000},
                new double[]{450,460,480,400,320,340,250});
    }

    public record Request(String companyName){}
    public record Response(double [] turnover , double [] profit,double [] stock){}

}
