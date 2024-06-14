package com.aledma.cicdproject.controller;

import com.aledma.cicdproject.service.OAuthService;
import com.aledma.cicdproject.service.dto.response.InfoResponseDto;
import com.aledma.cicdproject.service.dto.response.KakaoUserInfoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/oauth")
@RestController
public class OAuthController {
    private final OAuthService oAuthService;

    @GetMapping("/callback")
    public ResponseEntity<InfoResponseDto> callback(@RequestParam("code") String code){
        String accessToken = oAuthService.getAccessToken(code);
        return ResponseEntity.ok(oAuthService.getUserInfo(accessToken));
    }
}
