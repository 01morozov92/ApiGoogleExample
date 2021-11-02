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
public class DateUpdated{

	@JsonProperty("sec")
	private Integer sec;

	@JsonProperty("usec")
	private Integer usec;
}