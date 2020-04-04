package org.example.bdd.dtos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "IsSuccess",
        "UserMessage",
        "TechnicalMessage",
        "TotalCount",
        "Response"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryDto {

    @JsonProperty("IsSuccess")
    private Boolean isSuccess;

    @JsonProperty("UserMessage")
    private Object userMessage;

    @JsonProperty("TechnicalMessage")
    private Object technicalMessage;

    @JsonProperty("TotalCount")
    private Integer totalCount;

    @JsonProperty("Response")
    private List<CountrySpecificDto> response = null;

}