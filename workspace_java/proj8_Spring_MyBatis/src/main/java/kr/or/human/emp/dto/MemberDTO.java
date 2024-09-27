package kr.or.human.emp.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor // 생성자
@EqualsAndHashCode // 전달인자로 받은 것이랑 똑같으면, 다르면
@Data
public class MemberDTO {

	private String userID;
	private String userPW;
	private int age;

}
