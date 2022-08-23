# API GATEWAY

[Spring Cloud로 개발하는 마이크로 서비스](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%81%B4%EB%9D%BC%EC%9A%B0%EB%93%9C-%EB%A7%88%EC%9D%B4%ED%81%AC%EB%A1%9C%EC%84%9C%EB%B9%84%EC%8A%A4/)를 듣고 실습한 내용입니다.

## 개발환경
* Java11
* SpringBoot
* SpringCloud
* Postman
* Eureka
* zuul

## API Gateway + Service discovery + Sample service
discoveryservice - Service discovery   
apigateway-service - Spring Cloud Gateway   
zuul-service - Spring Cloud Netflix Zuul   
first-service - example for apigateway service   
second-service - example for apigateway service


## how it works
1. first-service, second-service, api-gateway를 eureka 서버에 등록
2. gateway를 통해 first/second 서비스에 접근
3. 복수의 service를 등록하여 eureka가 load balancing

### request example
```
GET localhost:8000/first-service/check
```
![image](https://user-images.githubusercontent.com/45115557/186112856-186d0113-42d3-4e4a-8017-fb9f90f87cf4.png)


random port설정을 해놓은 first service는 여러개가 띄워져 있을때 eureka가 자동으로 로드밸런싱 하여 서버 매핑해줌.

### eureka image
![image](https://user-images.githubusercontent.com/45115557/186111806-b67aad10-6706-4077-802f-53c7cef2203b.png)

