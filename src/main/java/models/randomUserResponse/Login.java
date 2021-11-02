package models.randomUserResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login{

	@JsonProperty("sha1")
	private String sha1;

	@JsonProperty("password")
	private String password;

	@JsonProperty("salt")
	private String salt;

	@JsonProperty("sha256")
	private String sha256;

	@JsonProperty("uuid")
	private String uuid;

	@JsonProperty("username")
	private String username;

	@JsonProperty("md5")
	private String md5;
}