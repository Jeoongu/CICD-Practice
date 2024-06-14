package com.aledma.cicdproject.service.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor //역직렬화를 위한 기본 생성자
public class InfoResponseDto {
    public Long id;
    public String nickName;
    public String profileImageUrl;

}
