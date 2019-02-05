package com.hfj.cloud.resource.server.rest;
/**
 * @author HFJ
 *
 */
import java.util.Collection;
import java.util.HashSet;

import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileOsDetails {

	HashSet<MobileOs> mobileOs = new HashSet<>();

	@GetMapping(value = "/getOsDetails")
	private Collection<MobileOs> mobileOsDetails() {
		if (ObjectUtils.isEmpty(mobileOs)) {
			mobileOs.add(new MobileOs(8, "Oreo"));
			mobileOs.add(new MobileOs(9, "Pi"));
		}
		return mobileOs;
	}

}
