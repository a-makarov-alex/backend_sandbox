maven-surefire-plugin - предназначен для запуска тестов и генерации отчетов по результатам их выполнения

maven-surefire-report-plugin - для создания HTML отчёта.
Команда:
- mvn surefire-report:report

NEXUS:
для публикации артифакта в Nexus после сборки:
1. указаны данные в pom файле: snapshotRepository
2. используется по умолчанию maven-deploy-plugin. Если надо использовать другой плагин, сначала надо отключить этот. См. в интернете.
3. файл с настройками для nexus: 