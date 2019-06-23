package sombrero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * devtools
     *
     * 1. 개발 작업 시 바로바로 변경된 결과를 볼 수 있도록 캐시를 끔.
     *
     * static {
     * 		Map<String, Object> devToolsProperties = new HashMap<>();
     * 		devToolsProperties.put("spring.thymeleaf.cache", "false");
     * 		devToolsProperties.put("spring.freemarker.cache", "false");
     * 		devToolsProperties.put("spring.groovy.template.cache", "false");
     * 		devToolsProperties.put("spring.mustache.cache", "false");
     * 		devToolsProperties.put("server.servlet.session.persistent", "true");
     * 		devToolsProperties.put("spring.h2.console.enabled", "true");
     * 		devToolsProperties.put("spring.resources.cache.period", "0");
     * 		devToolsProperties.put("spring.resources.chain.cache", "false");
     * 		devToolsProperties.put("spring.template.provider.cache", "false");
     * 		devToolsProperties.put("spring.mvc.log-resolved-exception", "true");
     * 		devToolsProperties.put("server.servlet.jsp.init-parameters.development", "true");
     * 		devToolsProperties.put("spring.reactor.stacktrace-mode.enabled", "true");
     * 		PROPERTIES = Collections.unmodifiableMap(devToolsProperties);
     *        }
     *
     *
     *
     * 2. 코드 수정 시 자동 리스타트. (수동으로 재시작하는 것보다 빠름.)
     *      빌드만 하면 브라우저 상태도 자동으로 변경됨.
     *      스프링 부트는 두개의 클래스 로더를 사용.
     *      Base ClassLoader -> 의존성을 읽어들이는 클래스로더. (우리가 변경하지 않는 부분.)
     *      Restart ClassLoader -> 애플리케이션 재시작  애플리케이션을 읽어들이는 클래스로더.
     *      라이브리 릴로드 -> 브라우저에 플러그인으로 설치해야 함.
     *      빌드 실패 확률이 커서 잘 안씀..
     */

}
