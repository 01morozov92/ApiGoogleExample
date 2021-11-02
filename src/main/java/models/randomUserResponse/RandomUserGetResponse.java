package models.randomUserResponse;

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
public class RandomUserGetResponse{

	@JsonProperty("results")
	private List<ResultsItem> results;

	@JsonProperty("info")
	private Info info;
}