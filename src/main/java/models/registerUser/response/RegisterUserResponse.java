package models.registerUser.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse{

	@JsonProperty("birthday")
	private Integer birthday;

	@JsonProperty("password")
	private String password;

	@JsonProperty("date_start")
	private Integer dateStart;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("name")
	private String name;

	@JsonProperty("avatar")
	private String avatar;

	@JsonProperty("email")
	private String email;

	@JsonProperty("hobby")
	private String hobby;
}