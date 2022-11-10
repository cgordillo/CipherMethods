package co.com.cgo.ciphermethods.controller.rest;

import java.util.Base64;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.cgo.ciphermethods.dto.CipherRequestDto;
import co.com.cgo.ciphermethods.dto.CipherResponseDto;

@RestController
@RequestMapping("Encrypt/V1.0")
public class EncryptController {

	@PostMapping("cipherBase64")
	public CipherResponseDto encryptBase64(@RequestBody CipherRequestDto request) {
		CipherResponseDto response= CipherResponseDto.getInstance();
		String encodedString = Base64.getEncoder().encodeToString(request.getText().getBytes());
		response.setResultText(encodedString);
		return response;
	}	
	
	@PostMapping("hashSha256")
	public CipherResponseDto encryptSha256(@RequestBody CipherRequestDto request){
		CipherResponseDto response= CipherResponseDto.getInstance();
		String sha256hex = DigestUtils.sha256Hex(request.getText());
		response.setResultText(sha256hex);
		return response;
	}
}
