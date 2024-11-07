package com.example.myaiagentsapp.tools;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service("countryIdentityInfo")
@Description("""
        Get Identity Information about a given company including :
        - The Name of the Company
        - The country of the Company
        - The industry domain of the Company
        - The founded year of the Company
        """)
public class CountryIdentityInfo  implements Function<CountryIdentityInfo.Request, CountryIdentityInfo.Response> {
    public record Request(String companyName){};
    public record Response(String companyName ,
                           String country,
                           String industryDomain,
                           int foundedYear
                           ){};
    @Override
    public Response apply(Request request) {
        return new Response(request.companyName(),"Tunisie","Telecom",1911);
    }


}
