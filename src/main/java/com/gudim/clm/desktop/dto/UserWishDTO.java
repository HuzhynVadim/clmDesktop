package com.gudim.clm.desktop.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserWishDTO {
	String characterType;
	String wishNumber;
	String secondWishNumber;
	String nickname;
}