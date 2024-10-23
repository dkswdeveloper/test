package com.fil.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "sorting.properties")
public class MyBeanConfig
{
//	@Value("${sorting.algo.bubble: Not Found}")
	@Value("${sorting.algo.bubble}")
	String sortingType;
	
	@Bean
	@Primary
	public MySorting myDefaultSorting()
	{
		return new MySorting(sortingType);
	}
	@Bean(name = "selectionSorting")
	public MySorting getMySelectionSorting()
	{
		return new MySorting("Selection Sort");
	}

}
