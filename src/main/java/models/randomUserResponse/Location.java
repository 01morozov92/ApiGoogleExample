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
public class Location{

	@JsonProperty("country")
	private String country;

	@JsonProperty("city")
	private String city;

	@JsonProperty("street")
	private Street street;

	@JsonProperty("timezone")
	private Timezone timezone;

	@JsonProperty("postcode")
	private Integer postcode;

	@JsonProperty("coordinates")
	private Coordinates coordinates;

	@JsonProperty("state")
	private String state;
}