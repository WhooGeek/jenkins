# Open JDK 17이 설치 된 Apline Linux 이미지를 기반으로 함
FROM openjdk:17-alpine
# 빌드 된 jar 파일을 컨테이너의 루트 디렉토리에 app.jar로 복사 함
COPY build/libs/*.jar app.jar
# 컨테이너 시작 시 app.jar 파일을 실행하는 명령을 설정
ENTRYPOINT ["java", "-jar", "app.jar"]
