maven-surefire-plugin - предназначен для запуска тестов и генерации отчетов по результатам их выполнения

maven-surefire-report-plugin - для создания HTML отчёта.
Команда:
- mvn surefire-report:report

NEXUS:
для публикации артифакта в Nexus после сборки:
1. указаны данные в pom файле: snapshotRepository
2. используется по умолчанию maven-deploy-plugin. Если надо использовать другой плагин, сначала надо отключить этот. См. в интернете.
3. файл с настройками для nexus: 

SWAGGER:
- http://localhost:8083/swagger-ui/index.html

JENKINS:
- для деплоя на сервер (tomcat) требуется war файл вместо jar.
- поскольку spring-boot-starter-web автоматически добавляет свой томкат в сборку, в pom.xml мы его явным образом исключаем и оставляем только для scope provided. В настройках IDEA надо выставить флаг, см. комментарий в pom.xml.

TOMCAT
чтобы достучаться до эндпойнтов, понадобилось:
- в main классе указать @EnableWebMvc и наследоваться от SpringBootServletInitializer
- в pom.xml добавить зависимость javax.servlet-api

Как работает:
В пайплайне JENKINS указан репозиторий на GitHub, из которого берется main ветка. Для кода из ветки осуществляется сборка mvn clean install. Далее артефакт war отправляется на сервер tomcat.
