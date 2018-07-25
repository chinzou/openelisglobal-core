/**
* The contents of this file are subject to the Mozilla Public License
* Version 1.1 (the "License"); you may not use this file except in
* compliance with the License. You may obtain a copy of the License at
* http://www.mozilla.org/MPL/
*
* Software distributed under the License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
* License for the specific language governing rights and limitations under
* the License.
*
* The Original Code is OpenELIS code.
*
* Copyright (C) The Minnesota Department of Health.  All Rights Reserved.
*/
package us.mn.state.health.lims.sampleorganization.valueholder;

import us.mn.state.health.lims.common.valueholder.BaseObject;
import us.mn.state.health.lims.common.valueholder.ValueHolder;
import us.mn.state.health.lims.common.valueholder.ValueHolderInterface;
import us.mn.state.health.lims.organization.valueholder.Organization;
import us.mn.state.health.lims.sample.valueholder.Sample;

public class SampleOrganization extends BaseObject {

	private static final long serialVersionUID = 1L;

	private String id;

	private ValueHolderInterface organization;

	private ValueHolderInterface sample;

	private String sampleOrganizationType;



	public SampleOrganization() {
		super();
		this.sample = new ValueHolder();
		this.organization = new ValueHolder();
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setSampleOrganizationType(String sampleOrganizationType) {
		this.sampleOrganizationType = sampleOrganizationType;
	}

	public String getSampleOrganizationType() {
		return sampleOrganizationType;
	}


	public Sample getSample() {
		return (Sample) this.sample.getValue();
	}

	public void setSample(Sample sample) {
		this.sample.setValue(sample);
	}

	public Organization getOrganization() {
		return (Organization) this.organization.getValue();
	}

	public void setOrganization(Organization organization) {
		this.organization.setValue(organization);
	}
}