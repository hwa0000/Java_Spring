package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component //개발자가 생성한 class를 spring의 bean으로 등록할때 사용하는 Annotation
@ToString
@Getter
@RequiredArgsConstructor

public class SampleHotel {
	@NonNull
	private Chef chef;

}
