package models.createUser.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompaniesItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private Integer id;
}