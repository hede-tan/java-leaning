package com.lindsey.java.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.lindsey.java.annotation.configuration.filter.MyComponentScanTypeFilter;
import com.lindsey.java.annotation.po.User;

/**
 * 使用@configuration的方式注册bean
 */
@Configuration

//在这个包下只注入Controller注解标记的bean,添加过滤条件的时候必须将useDefaultFilters=true
@ComponentScan(value="com.lindsey.java",
		includeFilters = { //@Filter(type = FilterType.ANNOTATION,classes = Controller.class),
		@Filter(type=FilterType.CUSTOM,classes = MyComponentScanTypeFilter.class)},
		useDefaultFilters = false
		)
public class BeanConfig {

	/**
	 * 默认@bean使用方法名作为bean的名称
	 * 可以通过value设置别名
	 */
	@Bean("user")
	public User user111() {
		return new User("lisi", 20);
	}
}
