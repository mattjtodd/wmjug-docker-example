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
import org.junit.experimental.categories.Category;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.web.client.RestTemplate;

import static java.lang.System.getProperty;

import static org.junit.Assert.assertNotNull;

/**
 * A simple set of integration tests for the Random Whale service.
 * 
 * @author Matt Todd
 */
@Category(IntegrationTest.class)
public class RandomWhaleTest
{
	@Test
	public void checkService()
	{
		RestTemplate restTemplate = new RestTemplate();
		Whale whale = restTemplate.getForObject(getProperty("log.url"), Whale.class);
		
		assertNotNull(whale.getName());
	}
}
