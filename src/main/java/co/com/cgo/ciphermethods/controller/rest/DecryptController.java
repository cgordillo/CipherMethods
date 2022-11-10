package co.com.cgo.ciphermethods.controller.rest;

import java.util.Base64;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.cgo.ciphermethods.dto.CipherRequestDto;
import co.com.cgo.ciphermethods.dto.CipherResponseDto;

@RestController
@RequestMapping("Decrypt/V1.0")
public class DecryptController {

	@PostMapping("decipherBase64")
	public CipherResponseDto decryptBase64(@RequestBody CipherRequestDto request) {
		CipherResponseDto response= CipherResponseDto.getInstance();
		byte[] decodedBytes = Base64.getDecoder().decode(request.getText());
		String decodedString = new String(decodedBytes);
		response.setResultText(decodedString);
		return response;
	}

}
