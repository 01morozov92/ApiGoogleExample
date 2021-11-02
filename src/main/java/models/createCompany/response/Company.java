package models.createCompany.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company{

	@JsonProperty("ogrn")
	private String ogrn;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("name")
	private String name;

	@JsonProperty("inn")
	private String inn;

	@JsonProperty("kpp")
	private String kpp;

	@JsonProperty("adress")
	private String adress;

	@JsonProperty("type")
	private String type;

	@JsonProperty("users")
	private List<String> users;
}