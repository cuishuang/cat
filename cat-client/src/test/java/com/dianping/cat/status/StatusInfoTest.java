/*
 * Copyright (c) 2011-2018, Meituan Dianping. All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dianping.cat.status;

import org.junit.Assert;
import org.junit.Test;

import com.dianping.cat.status.model.StatusInfoHelper;
import com.dianping.cat.status.model.entity.StatusInfo;
import com.dianping.cat.support.Files;

public class StatusInfoTest {
	@Test
	public void testXml() throws Exception {
		String source = Files.forIO().readFrom(getClass().getResourceAsStream("status.xml"), "utf-8");
		StatusInfo root = StatusInfoHelper.fromXml(source);
		String xml = StatusInfoHelper.asXml(root);
		String expected = source;

		Assert.assertEquals("XML is not well parsed!", expected.replace("\r", ""), xml.replace("\r", ""));
	}
}
