package models.createUser.response;

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
public class CreateUserResponse{

	@JsonProperty("birthday")
	private Birthday birthday;

	@JsonProperty("date")
	private String date;

	@JsonProperty("fathername1")
	private String fathername1;

	@JsonProperty("date_updated")
	private DateUpdated dateUpdated;

	@JsonProperty("role")
	private List<String> role;

	@JsonProperty("gender")
	private Object gender;

	@JsonProperty("hamster")
	private String hamster;

	@JsonProperty("date_register")
	private DateRegister dateRegister;

	@JsonProperty("cavy")
	private String cavy;

	@JsonProperty("surname1")
	private String surname1;

	@JsonProperty("squirrel")
	private String squirrel;

	@JsonProperty("date_start")
	private DateStart dateStart;

	@JsonProperty("companies")
	private List<CompaniesItem> companies;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("cat")
	private String cat;

	@JsonProperty("name")
	private String name;

	@JsonProperty("adres")
	private Object adres;

	@JsonProperty("name1")
	private String name1;

	@JsonProperty("dog")
	private String dog;

	@JsonProperty("parrot")
	private String parrot;

	@JsonProperty("by_user")
	private String byUser;

	@JsonProperty("email")
	private String email;

	@JsonProperty("tasks")
	private List<TasksItem> tasks;

	@JsonProperty("hobby")
	private String hobby;
}