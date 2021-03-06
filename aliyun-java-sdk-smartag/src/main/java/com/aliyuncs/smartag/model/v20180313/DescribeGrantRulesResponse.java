/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeGrantRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGrantRulesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<GrantRule> grantRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<GrantRule> getGrantRules() {
		return this.grantRules;
	}

	public void setGrantRules(List<GrantRule> grantRules) {
		this.grantRules = grantRules;
	}

	public static class GrantRule {

		private String grantRuleId;

		private Long cenUid;

		private Long ccnId;

		private String cenInstanceId;

		private String ccnInstanceId;

		private Long gmtCreate;

		private Long gmtModified;

		private String regionId;

		public String getGrantRuleId() {
			return this.grantRuleId;
		}

		public void setGrantRuleId(String grantRuleId) {
			this.grantRuleId = grantRuleId;
		}

		public Long getCenUid() {
			return this.cenUid;
		}

		public void setCenUid(Long cenUid) {
			this.cenUid = cenUid;
		}

		public Long getCcnId() {
			return this.ccnId;
		}

		public void setCcnId(Long ccnId) {
			this.ccnId = ccnId;
		}

		public String getCenInstanceId() {
			return this.cenInstanceId;
		}

		public void setCenInstanceId(String cenInstanceId) {
			this.cenInstanceId = cenInstanceId;
		}

		public String getCcnInstanceId() {
			return this.ccnInstanceId;
		}

		public void setCcnInstanceId(String ccnInstanceId) {
			this.ccnInstanceId = ccnInstanceId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeGrantRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGrantRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
