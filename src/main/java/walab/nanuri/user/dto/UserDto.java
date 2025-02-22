package walab.nanuri.user.dto;

import lombok.Builder;
import lombok.Getter;
import walab.nanuri.user.entity.User;

@Builder
@Getter
public class UserDto {
  private String uniqueId;

  private String name;

  private String status;

  private String email;

  private Integer grade;

  private Integer semester;

  private String department;

  private String major1;

  private String major2;

  public static UserDto from(User user) {
    return UserDto.builder()
        .uniqueId(user.getUniqueId())
        .name(user.getName())
        .status(user.getStatus().toString())
        .email(user.getEmail())
        .grade(user.getGrade())
        .semester(user.getSemester())
        .department(user.getDepartment())
        .major1(user.getMajor1())
        .major2(user.getMajor2())
        .build();
  }
}