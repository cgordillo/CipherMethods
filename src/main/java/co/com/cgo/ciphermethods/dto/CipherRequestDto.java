package co.com.cgo.ciphermethods.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CipherRequestDto {
	public String text;
	public static CipherRequestDto instance;
	
	public static CipherRequestDto getInstance() {
		if(instance == null) {
			instance = new CipherRequestDto();
		}
		return instance;
	}
}
