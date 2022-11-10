package co.com.cgo.ciphermethods.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CipherResponseDto {
	public String resultText;
	public static CipherResponseDto instance;
	
	public static CipherResponseDto getInstance() {
		if(instance == null) {
			instance = new CipherResponseDto();
		}
		return instance;
	}
}
