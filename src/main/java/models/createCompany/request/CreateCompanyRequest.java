package models.createCompany.request;

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
public class CreateCompanyRequest{

	@JsonProperty("company_type")
	private String companyType;

	@JsonProperty("company_name")
	private String companyName;

	@JsonProperty("email_owner")
	private String emailOwner;

	@JsonProperty("company_users")
	private List<String> companyUsers;
}