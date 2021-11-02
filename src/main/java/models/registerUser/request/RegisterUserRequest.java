package models.registerUser.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserRequest{

	@Builder.Default
	@JsonProperty("password")
	private String password = "1234";

	@JsonProperty("name")
	private String name;

	@JsonProperty("email")
	private String email;
}