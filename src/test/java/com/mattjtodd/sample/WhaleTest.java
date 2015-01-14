/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mattjtodd.sample;

import org.junit.Test;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the Whale POJO.
 * @author Matt Todd
 *
 */
public class WhaleTest
{
	@Test
	public void setNameCheckingNameSetCorrectly()
	{
		String name = randomAlphabetic(5);
		
		Whale whale = new Whale();
		whale.setName(name);
		
		assertEquals(name, whale.getName());
	}
}
