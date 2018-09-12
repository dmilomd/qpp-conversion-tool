package gov.cms.qpp.conversion.api.controllers.v2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.cms.qpp.conversion.api.controllers.SkeletalCpcFileController;
import gov.cms.qpp.conversion.api.model.Constants;
import gov.cms.qpp.conversion.api.services.CpcFileService;

/**
 * Controller to handle cpc file data version two
 */
@RestController
@RequestMapping(path = "/", headers = {"Accept=" + Constants.V2_API_ACCEPT})
public class CpcFileControllerV2 extends SkeletalCpcFileController {

	public CpcFileControllerV2(final CpcFileService cpcFileService) {
		super(cpcFileService);
	}
}