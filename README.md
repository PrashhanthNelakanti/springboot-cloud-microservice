# SpringBoot Cloud Microservice

## How to clone the project 

```
git clone https://github.com/PrashhanthNelakanti/springboot-cloud-microservice.git
```
## Running the Project 

### Let's start with service-registry server along with other cloud servers and services
* [service-registery](service-registry/README.md)
* [config-server](config-server/README.md)
* [hystrix-dashboard](hystrix-dashboard/README.md)
* [cloud-gateway](cloud-gateway/README.md)
* [products](products/README.md)
* [inventory](inventory/README.md)
* [rps](rps/README.md)

### Now, once all the services are up and running we can verify on the service-registry

<img src="readme-imgs/eureka.png"/>

### Starting Zipkin Server
```
product-microservice git:(main) ✗ java -jar zipkin-server-2.23.2-exec.jar

```
### Zipkin logs
<img src="readme-imgs/zipkin-logs.png"/>

### CloudGateway with Hystrix stream
<img src="readme-imgs/cloud-gateway-stream.png"/>

### Hystrix DashBoard ('localhost' worked for me rather than the ip add.)
<img src="readme-imgs/hystrix-page.png"/>

### Cloud Config response
<img src="readme-imgs/cloud-config-resp.png"/>







