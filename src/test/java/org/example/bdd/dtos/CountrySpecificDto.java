package org.example.bdd.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Name",
        "Alpha2Code",
        "Alpha3Code",
        "NativeName",
        "Region",
        "SubRegion",
        "Latitude",
        "Longitude",
        "Area",
        "NumericCode",
        "NativeLanguage",
        "CurrencyCode",
        "CurrencyName",
        "CurrencySymbol",
        "Flag",
        "FlagPng"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountrySpecificDto {


    @JsonProperty("Name")
    private String name;

    @JsonProperty("Alpha2Code")
    private String alpha2Code;

    @JsonProperty("Alpha3Code")
    private String alpha3Code;

    @JsonProperty("NativeName")
    private String nativeName;

    @JsonProperty("Region")
    private String region;

    @JsonProperty("SubRegion")
    private String subRegion;

    @JsonProperty("Latitude")
    private String latitude;

    @JsonProperty("Longitude")
    private String longitude;

    @JsonProperty("Area")
    private Integer area;

    @JsonProperty("NumericCode")
    private Integer numericCode;

    @JsonProperty("NativeLanguage")
    private String nativeLanguage;

    @JsonProperty("CurrencyCode")
    private String currencyCode;

    @JsonProperty("CurrencyName")
    private String currencyName;

    @JsonProperty("CurrencySymbol")
    private String currencySymbol;

    @JsonProperty("Flag")
    private String flag;

    @JsonProperty("FlagPng")
    private String flagPng;

}