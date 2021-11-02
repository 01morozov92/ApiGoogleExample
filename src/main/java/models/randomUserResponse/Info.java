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
public class Info{

	@JsonProperty("seed")
	private String seed;

	@JsonProperty("page")
	private Integer page;

	@JsonProperty("results")
	private Integer results;

	@JsonProperty("version")
	private String version;
}