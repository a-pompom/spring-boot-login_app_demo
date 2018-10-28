package login.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ログイン画面のコントローラ部分の役割はWebSecurityConfigが担っているので、
 * ViewNameと画面の対応づけを行うために実装
 * @author aoi
 *
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	/**
	 * 「/login」というURLからlogin.htmlを呼び出す
	 */
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
	}

}
