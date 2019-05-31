package com.lindsey.java.annotation.configuration.filter;

import java.io.IOException;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyComponentScanTypeFilter implements TypeFilter{
	
	/**
	 * metadataReader:获取当前注解类的信息
	 * metadataReaderFactory:获取所有注解类的信息
	 */
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		String className = annotationMetadata.getClassName();
		if(className.contains("Service")) {
			return true;
		}
		
		return false;
	}

}
