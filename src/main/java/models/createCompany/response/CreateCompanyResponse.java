package models.createCompany.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCompanyResponse{

	@JsonProperty("id_company")
	private Integer idCompany;

	@JsonProperty("company")
	private Company company;

	@JsonProperty("type")
	private String type;

	@JsonProperty("message")
	private String message;
}