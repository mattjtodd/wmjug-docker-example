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

/**
 * @author Matt Todd
 *
 */
public final class Whale
{
	private String name;

	private int age;

	private int weight;

	/**
	 * For Jackson
	 */
	Whale()
	{
	}
	
	public Whale(String name, int age, int weight)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @return the weight
	 */
	public int getWeight()
	{
		return weight;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
}
